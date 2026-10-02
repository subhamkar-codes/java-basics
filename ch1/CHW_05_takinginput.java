import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Scanner;
public class CHW_05_takinginput {
    public static void main(String args[]){
        System.out.println("Taking input from user ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int a = sc.nextInt();
        System.out.println("Enter Number 2: ");
        int b = sc.nextInt();
        int Sum = a + b;
        System.out.println("The Sum of these 2 numbers are "+ Sum );
    }
}
