import java.util.Scanner;
public class CWH_Ch1_PS_1 {
    static void main() {
        System.out.println("This program is for taking 3 user input and do the sum and give the result");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();
        int sum = a + b + c;
        System.out.println("The Sum of three numbers is " + sum);
    }
}
