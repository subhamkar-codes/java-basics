import java.util.Scanner;

public class CWH_CH4_V19_PS_p5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year: ");
        int year = sc.nextInt();
        if (year == 1900){
            System.out.println("Your year is a not leap year");
        } else if (year % 400 == 0) {
            System.out.println("Your year is a leap year");
        } else if (year % 100 == 0) {
            System.out.println("Your year is not a leap year");
        } else if (year % 4 == 0) {
            System.out.println("Your year is a leap year");
        } else {
            System.out.println("Your year is not a leap year");
        }
    }
}
