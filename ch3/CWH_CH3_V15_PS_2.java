import java.util.Scanner;

public class CWH_CH3_V15_PS_2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String name = sc.nextLine();
        String rpls = name.replace(" ", "_");
        System.out.println("Now in ur string space is replaced with _ = "+rpls);

    }
}
