import java.util.Scanner;

public class CHW_Ch1_PS_2 {
    static void main() {
        System.out.println("This program is to calculate CGPA of 3 subjects out of 10 ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of your 1st subject");
        float a = sc.nextFloat();
        System.out.println("Enter the Number of your 2nd subject");
        float b = sc.nextFloat();
        System.out.println("Enter the Number of your 3rd subject");
        float c = sc.nextFloat();
        Float sum = a + b + c;
        Float cgpa = sum/30.0f;
        System.out.println("Your cgpa is " + cgpa);
    }
}
