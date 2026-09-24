import java.util.Scanner;

public class CWH_CH2_PS_Q4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your V ");
        float V = sc.nextFloat();
        System.out.println("Enter your U ");
        float U = sc.nextFloat();
        System.out.println("Enter your a ");
        float a = sc.nextFloat();
        System.out.println("Enter your s ");
        float s = sc.nextFloat();
        float means = (((V * V) - (U * U))/(2*a*s));
        System.out.println("The calculated value is "+means);
    }
}
