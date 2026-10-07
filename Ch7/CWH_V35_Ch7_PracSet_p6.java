import java.util.Scanner;

public class CWH_V35_Ch7_PracSet_p6 {
    static  float avg (int ...arr){
        float result = 0;
        for (float a : arr){
            result += a;
        }
        return result/ arr.length;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number u want? ");
        int n = sc.nextInt();
        int [] num =new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Enter your numbers: " + (i + 1));
            num[i]= sc.nextInt();
        }
        System.out.println("The value of the avg is " +avg(num));
    }
}
