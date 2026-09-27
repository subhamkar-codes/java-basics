import java.util.Scanner;

public class CWH_CH4_V19_PS_p3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your yearly salary: ");
        float a = sc.nextInt();
       if ( a <= 250000){
           System.out.println("You dont have to pay any tax");
       }
       else if (a > 250000 && a <= 500000) {
           System.out.println("You have to pay 5% tax ");
           float tax1 = a*0.05f;
           System.out.println("You have to pay tax amount of " + tax1);
       }
       else if (a > 500000 && a < 1000000) {
           System.out.println("You have to pay 20% tax ");
           float tax2 = a*0.20f;
           System.out.println("You have to pay tax amount of " + tax2);
       }
       else {
           System.out.println("You have to pay 30% tax ");
           float tax3 = a*0.30f;
           System.out.println("You have to pay tax amount of " + tax3);
       }
    }
}
