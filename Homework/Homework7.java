abstract class Printer {
    private String model;
    private int printedCount;
    private int availableCount;

    public Printer(String model, int availableCount) {
        this.model = model;
        this.availableCount = availableCount;
        this.printedCount = 0;
    }
    public abstract boolean print();

    public String getModel(){return model;}
    public int getPrintedCount(){return printedCount;}
    public int getAvailableCount(){return availableCount;}

    public void setPrintedCount(int printedCount){this.printedCount = printedCount;}
    public void setAvailableCount(int availableCount){this.availableCount = availableCount;}

}
class InkjetPrinter extends Printer {
    public InkjetPrinter(String model, int availableCount) {
        super(model, availableCount);
    }
    @Override
    public boolean print() {
        if(getAvailableCount() == 0){
            System.out.println(getModel() + ": " + (getPrintedCount() + 1) + "매째 인쇄 실패 - 잉크 부족");
            return false;
        }
        setPrintedCount(getPrintedCount()+1);
        setAvailableCount(getAvailableCount()-1);
        return true;
    }
}
class LaserPrinter extends Printer {
    public LaserPrinter(String model, int availableCount){
        super(model, availableCount);
    }
    @Override
    public boolean print(){
        if(getAvailableCount() == 0){
            System.out.println(getModel()+": "+(getPrintedCount()+1)+"매째 인쇄 실패 - 토너 부족");
            return false;
        }
        setAvailableCount(getAvailableCount()-1);
        setPrintedCount(getPrintedCount()+1);
        return true;
    }

}
public class Homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T730DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while (inkjet.print());
        while (laser.print());
    }
}