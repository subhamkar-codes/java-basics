import java.util.Scanner;

public class CWH_Ch1_PS_5 {
    static void main() {
        System.out.println("This is a program to check if the user input integer or nor ");
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
        System.out.println("If output shows true thats mean user input was a integer otherwise not");
    }
}
