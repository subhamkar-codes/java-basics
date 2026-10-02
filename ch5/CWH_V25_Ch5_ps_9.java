import java.util.Scanner;

public class CWH_V25_Ch5_ps_9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number which's multiplication table u want: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            int multi = n * i;
            System.out.println(n + " X " + i + " = " + multi);
            sum += multi;

        }
        System.out.println("The sum of your table is " + sum);
    }
}
