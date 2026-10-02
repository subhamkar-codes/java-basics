import java.util.Scanner;

public class CWH_V25_Ch5_ps_2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number till u want to sum: ");
        int n = sc.nextInt();
        int sum = 0;

        /* Using while loop */
//          int i = 0;
//        while ( i < n) {
//            sum = sum + (i * 2);
//            i++;
//        }
//        System.out.println("your sum is "+ sum);

        /* Using for loop */

        for (int i = 0 ; i < n ; i++ ){
            sum = sum + (i * 2);
        }
        System.out.println("The sum of your first n even number is " +sum);
    }
}
