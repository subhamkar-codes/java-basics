import java.util.Scanner;

public class CWH_V35_Ch7_PracSet_p5 {
    static int fibonachi (int t){
        if ( t == 1 ){
            return 0;
        } else if (t == 2) {
            return 1;
        } else {
            return fibonachi(t-1) + fibonachi(t - 2);
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int a = sc.nextInt();
        System.out.println("your fibonachi is "+fibonachi(a));
    }
}
