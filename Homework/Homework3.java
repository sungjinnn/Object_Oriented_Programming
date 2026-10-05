import java.util.Scanner;
public class Homework3 {
    static int Fmax(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i]>max)
                max = arr[i];
        }
        return max;
    }
    static int Fmin(int[] arr){
        int min = arr[0];
        for(int i=0; i < arr.length; i++){
            if(min > arr[i])
                min = arr[i];
        }
        return min;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int Arrlength = sc.nextInt();
        int[] mxmn = new int[Arrlength];

        System.out.print("수를 입력하세요: ");
        for(int i = 0; i < mxmn.length; i++){
            mxmn[i] = sc.nextInt();
        }
        System.out.printf("최대값: %d\n",Fmax(mxmn));
        System.out.printf("최소값: %d\n",Fmin(mxmn));
    }
}
