import java.util.Scanner;

public class CWH_V22_do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till u need the output: ");
        int n = sc.nextByte();
        int a = 1;
        do {
            System.out.println(a);
            a++;
        }

        while (a<= n);
    }
}
