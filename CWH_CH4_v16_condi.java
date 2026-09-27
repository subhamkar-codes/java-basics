import java.util.Scanner;

public class CWH_CH4_v16_condi {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int a = sc.nextInt();
        if (a <= 40){
            System.out.println("You are cooked!!");
        }
        else {
            System.out.println("This time u are safe");
        }
    }
}
