import java.util.Scanner;

public class CWH_V29_PS_ARRAY_p3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float [] marks  = {80.3f,67.87f,75.6f,99.2f,85.4f};
        float sum = 0;
        for (float element: marks){
            sum = (sum + element);
        }
        float avg = sum/ marks.length;
        System.out.println("The avg of the phy mark is "+avg);
    }
}
