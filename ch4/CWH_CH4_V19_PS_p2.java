import java.util.Scanner;

public class CWH_CH4_V19_PS_p2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of your 1st subject: ");
        float a = sc.nextFloat();
        System.out.println("Enter the number of your 2nd subject: ");
        float b = sc.nextFloat();
        System.out.println("Enter the number of your 3rd subject: ");
        float c = sc.nextFloat();
        float per = ((a + b + c )/300)*100f;
        if (a >= 33 && b >= 33 && c >= 33 && per >= 40){
            System.out.println("You are passed!!");
            System.out.println("Your over all percentage is " +per);
        }
        else if (a >= 33 && b >= 33 && c >= 33 && per <= 40) {
            System.out.println("You failed because your overall percentage bellow 40%");
            System.out.println("Your over all percentage is " +per);
        }
        else {
            System.out.println("You failed !! one of your subjects contained below 33%");
            System.out.println("Your over all percentage is " +per);
        }
    }
}
