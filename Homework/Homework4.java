import java.util.Scanner;
public class Homework4 {
    int gcd(int m, int n){
        /* m == 0일때 오류 발생 */
        if(n == 0) { return m; }
        if(m > n){
            return gcd(n,m%n);
        }
        else
            return gcd(m,n%m);
    }
    public static void main(String[] args){
        Homework4 h = new Homework4();
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.printf("두 수의 최대공약수는 %d입니다.",h.gcd(num1,num2));
    }
}
