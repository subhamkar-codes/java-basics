import java.util.Scanner;

public class CWH_V25_Ch5_ps_4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number which's multiplication table u want: ");
        int n = sc.nextInt();
        for (int i = 10 ; i >= 1; i--){
            int multi = n * i;
            System.out.println(n + " X " + i + " = " + multi);
        }

    }
}