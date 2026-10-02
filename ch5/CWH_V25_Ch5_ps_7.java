import java.util.Scanner;

public class CWH_V25_Ch5_ps_7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        int i = n;
        while (i >= 0){
            int j = 0;
            while (j < i){
            System.out.print("*");
            j++;
            }
            System.out.print("\n");
            i--;
        }

    }
}
// ans of problem 8 is true............
