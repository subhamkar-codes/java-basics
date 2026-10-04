public class CWH_V29_PS_ARRAY_p7 {
    static void main(String[] args) {
        int [] arr = {1, 2 ,3, 4 , 5 , 6 , 97, 75, -128};
        int min = Integer.MAX_VALUE;
        for(int e: arr){
            if (e < min){
                min = e;}
        }
        System.out.println("The maximum element inside of the array is "+ min);
    }
}
