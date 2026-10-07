import java.util.Scanner;

public class CWH_V34_Ch7_rec_in_java {
    static int factorial (int n){
        if (n == 0 || n == 1 ){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
    static int fibonachi (int t){
        if (t == 0 || t == 1 ){
            return 1;
        }
        else {
            return t+fibonachi(t-1);
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your factorial: ");
    int a = sc.nextInt();
        System.out.println(factorial(a));
        System.out.println(fibonachi(a));
    }
}
