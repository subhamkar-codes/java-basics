import java.util.Scanner;

public class CWH_V35_Ch7_PracSet_p9 {
    static float cel2f(float n){
        return (n*(9f/5))+32f;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Celcius: ");
        float a = sc.nextFloat();
        System.out.println("Your Fahrenheit is: " + cel2f(a));
    }
}
