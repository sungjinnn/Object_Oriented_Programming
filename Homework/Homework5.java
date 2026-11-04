class PersonalComputer{
    private Computer computer;
    private Monitor monitor;
    public PersonalComputer(Monitor monitor, Computer computer){
        this.monitor = monitor;
        this.computer = computer;
    }
    public void turnOn(){
        computer.turnOn();
        monitor.turnOn();
    }
    public void printInfo(){
        computer.printInfo();
        monitor.printInfo();
    }
}

class Monitor{
    private String monitorSize;
    private String color;
    private String power;
    public Monitor(String ms, String c, String p){
        monitorSize = ms;
        color = c;
        power = p;
    }
    public void turnOn(){
        System.out.println("Turning on the monitor.");
    }
    public void printInfo(){
        System.out.println("The spec of the monitor");
        System.out.printf(" Size: %s\n",monitorSize);
        System.out.printf(" Color: %s\n",color);
        System.out.printf(" Power: %s\n",power);
    }
}

class Computer{
    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;
    public Computer(String cpu, String memory, String hd, String color, String power){
        this.cpu = cpu;
        this.memory = memory;
        this.hd = hd;
        this.color = color;
        this.power = power;
    }
    public void turnOn(){
        System.out.println("Turning on the computer.");
    }
    public void printInfo(){
        System.out.println("The spec of the computer");
        System.out.printf(" CPU: %s\n",cpu);
        System.out.printf(" Memory: %s\n",memory);
        System.out.printf(" HDD: %s\n",hd);
        System.out.printf(" Color: %s\n",color);
        System.out.printf(" Power: %s\n",power);
    }
}

public class Homework5 {
    public static void main(String[] args){
        PersonalComputer pc = new PersonalComputer(
                new Monitor("24 inch","Black","45W"),
                new Computer("Core i7", "16GB","2TB","White","500W")
        );
        pc.turnOn();
        pc.printInfo();
    }
}
