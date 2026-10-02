import java.util.Scanner;

public class CWH_CH4_V19_PS_p4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int a = sc.nextInt();
        if ( a == 1){
            System.out.println("Today is Monday");
        }
        else if (a == 2) {
            System.out.println("Today is Tuesday");
        }
        else if (a == 3) {
            System.out.println("Today is Wednesday");
        } else if (a == 4) {
            System.out.println("Today is Thursday");
        }
        else if (a == 5) {
            System.out.println("Today is Friday");
        }
        else if (a == 6) {
            System.out.println("Today is Saturday");
        }
        else {
            System.out.println("Today is Sunday");
        }


    }
}
