import java.util.Scanner;
class Student{
    int grade;
    String name;
    String major;
    int phonenumber;

    void setGrade(int grade) {this.grade = grade;}
    void setName(String name) {this.name = name;}
    void setMajor(String major) {this.major = major;}
    void setPhonenumber(int phonenumber) {this.phonenumber = phonenumber;}

    int getGrade() {return grade;}
    String getName() {return name;}
    String getMajor() {return major;}
    int getPhonenumber() {return phonenumber;}


}
public class Homework2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[3];

        for(int i=0;i<3;i++){
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            s[i] = new Student();
            s[i].setGrade(sc.nextInt());
            s[i].setName(sc.next());
            s[i].setMajor(sc.next());
            s[i].setPhonenumber(sc.nextInt());
        }
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        for(int i = 0;i<3;i++){
            String phone = '0' + Integer.toString(s[i].getPhonenumber());
            String phone2 = phone.substring(0,3) + '-' + phone.substring(3,7) + '-' + phone.substring(7,11);
            System.out.printf("%d번째 학생: %d %s %s %s\n",i+1,s[i].getGrade(),s[i].getName(),s[i].getMajor(),phone2);
        }

    }
}