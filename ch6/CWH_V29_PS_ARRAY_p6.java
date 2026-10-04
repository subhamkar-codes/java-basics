import java.io.FilterOutputStream;

public class CWH_V29_PS_ARRAY_p6 {
    static void main(String[] args) {
        int [] arr = {1, 2 ,3, 4 , 5 , 6 , 97, 75};
        int max = Integer.MIN_VALUE;
        for(int e: arr){
            if (e > max){
             max = e;}
        }
        System.out.println("The maximum element inside of the array is "+ max);
    }
}
