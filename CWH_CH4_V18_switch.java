import java.util.Scanner;

public class CWH_CH4_V18_switch {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your age: ");
        int age = sc.nextInt();
        switch (age) {
            case 18:
                System.out.println("You are going to become a adult: ");
                break;
            case 21:
                System.out.println("You are going to be cooked.");
                break;
            case 25:
                System.out.println("You are going to join a job");
                break;
            case 30:
                System.out.println("Are u doing good?");
                break;
            default:
                System.out.println("Enjoy your life!!");
                break;
        }





//        if (age >= 60){
//            System.out.println("Your are senior citizen and u can drive!! ");
//        }
//        else if (age >=18 && age < 60) {
//            System.out.println("Your are not a senior citizen but u can drive!! ");
//        }
//        else {
//            System.out.println("You are a minor and u cannot drive!! ");
//        }


   }
}
