import java.sql.SQLOutput;
import java.util.Scanner;
public class CHW_Ch1_PS_4 {
    static void main() {
        System.out.println("This is program where user input a kilo miter and system convert into mile ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter kilo miter: ");
        float a = sc.nextFloat();
        float mile = a*0.621371f;
        System.out.println("The miles are " + mile);
    }
}
