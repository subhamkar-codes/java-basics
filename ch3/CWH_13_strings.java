import java.util.Scanner;

public class CWH_13_strings {
    static void main() {
       // String name = new String("Subham");
        Scanner sc = new Scanner(System.in);
        String name = "Subham";
        System.out.print("The name is ");
        System.out.println(name);
        int a = 6;
        float b = 9709.233f;
        float c = a + b;
        System.out.printf("The value of a is %d and b is %f and the sum is %f \n", a ,b ,c);
        System.out.format("The value of a is %d and b is %f and the sum is %f \n ", a ,b ,c);
        System.out.println("Enter your name: ");
        String sk = sc.next();
        System.out.println("Enter Something: ");
        String sks = sc.nextLine();
        System.out.println("Your input was " + sks);
        System.out.println("Good Morning!! " + sk);
    }
}
