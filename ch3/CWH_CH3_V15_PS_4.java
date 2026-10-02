import java.util.Scanner;

public class CWH_CH3_V15_PS_4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String name = sc.nextLine();
        System.out.println("if output shows 1st and 2nd one -1 then ur strings does not contain any double and triple space \n" +
                " but if 1st one is number and 2nd one -1 then it contains double space not triple\n" +
                " but if it 1st -1 and 2 nd number it only contains triple space\n" +
                " but if both are number then it contains both\n ");
        System.out.println(name.indexOf("  "));
        System.out.println(name.indexOf("   "));
    }
}
