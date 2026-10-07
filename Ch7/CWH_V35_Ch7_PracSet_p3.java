import java.util.Scanner;

public class CWH_V35_Ch7_PracSet_p3 {
    static int sum (int n){
        if (n == 1){
            return 1;
        }
        else {
             return n + sum(n - 1);
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number till u want to add: ");
        int a = sc.nextInt();
        System.out.println("The sum of your 1st n natural number is "+sum(a));
    }
}
