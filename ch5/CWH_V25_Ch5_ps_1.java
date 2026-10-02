import java.util.Scanner;

public class CWH_V25_Ch5_ps_1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        for (int i = n; i>= 0 ; i-- ){
            for (int j = 0 ; j < i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
