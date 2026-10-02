import java.util.Scanner;
public class ExerciseOne {
    static void main() {
        System.out.println("This program is for calculate the mark percentage of a student" );
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Subject 1: ");
        int a = sc.nextInt();
        System.out.println("Enter the number of Subject 2: ");
        int b = sc.nextInt();
        System.out.println("Enter the number of Subject 3: ");
        int c = sc.nextInt();
        System.out.println("Enter the number of Subject 4: ");
        int d = sc.nextInt();
        System.out.println("Enter the number of Subject 5: ");
        int e = sc.nextInt();
        int sum = a + b + c + d + e;
        float avg = sum/5.0f;
        System.out.println("The Student's Mark percentage is " + avg);

    }
}
