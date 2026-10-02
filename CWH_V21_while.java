import java.util.Scanner;

public class CWH_V21_while {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
      int a = sc.nextInt();
        System.out.println("Enter your ending point: ");
     int n = sc.nextInt();

        while (a <= n) {
            boolean prime = true;
            int i = 2;
            while (i < a) {
                if (a % i == 0) {
                    prime = false;
                    break;
                }
                i++;
            }

            if (prime) {
                System.out.println(a);
            }
                a++;
        }
        System.out.println("The loop ends here");
      }
    }
