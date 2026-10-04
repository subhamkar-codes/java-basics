import java.util.Scanner;

public class CWH_V29_PS_ARRAY_p1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float [] arr  = {12.3f,67.87f,75.6f,99.2f,85.4f};
        float sum = 0;
        for (float element: arr){
            sum = sum + element;
        }
        System.out.println("the value of sum of the array is "+sum);
    }
}
//CWH_V29_PS_ARRAY_p