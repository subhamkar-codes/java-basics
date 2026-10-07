import java.util.Scanner;

public class CWH_V35_Ch7_PracSet_p1 {
    static void multi ( int n){
        for (int i = 1 ; i <= 10; i++){
            System.out.printf("%d X %d =%d \n",n  , i ,n*i );
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which's multiplication table u want: ");
        int a = sc.nextInt();
        multi(a);
    }
}
//CWH_V35_Ch7_PracSet_p