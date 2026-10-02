import java.util.Scanner;

public class CWH_V25_Ch5_ps_6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number till which u want your factorial to be: ");
        int n = sc.nextInt();
        int fact = 1;
        int i = 1;
        while (i <= n){
            fact *= i;

            i++;
        }
        System.out.println("Factorial till" + n + " is "+fact);
    }
}
