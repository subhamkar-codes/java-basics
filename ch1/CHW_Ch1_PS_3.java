import java.util.Scanner;
public class CHW_Ch1_PS_3 {
    static void main() {
        System.out.println("this is a program where user input a his name and system greed him with hello <name>");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your name: ");
        String sk = sc.next();
        System.out.println("HEllo!! " + sk + "!!" + " Have a good day!! ");
    }
}
