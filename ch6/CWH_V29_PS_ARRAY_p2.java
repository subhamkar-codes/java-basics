import java.util.Scanner;

public class CWH_V29_PS_ARRAY_p2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num  = {12,67,75,99,85};
        System.out.println("Enter your number: ");
        int target = sc.nextInt();
         boolean isInArray = false;
        for (int element: num){
            if (target == element){
                isInArray = true;
                break;
           }
        }
            if (isInArray){
                System.out.println("Your number is in array");
            }
            else {
                System.out.println("Your number is not inside the array");
            }
    }

}
