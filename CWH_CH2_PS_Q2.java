import java.util.Scanner;

public class CWH_CH2_PS_Q2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        char grade = sc.next().charAt(0);
        grade = (char) (grade + 8);
        System.out.println("Your encypted code is " + grade);

        //decrypt
        grade = (char) (grade - 8);
        System.out.println("Your decrypted code is "+grade);
    }
}
