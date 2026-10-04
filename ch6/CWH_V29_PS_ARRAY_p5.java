public class CWH_V29_PS_ARRAY_p5 {
    static void main(String[] args) {
        int [] arr = {1, 2 ,3, 4 , 5 , 6};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        for (int element: arr){
            System.out.print( " " +element);
        }
        System.out.println("\n");
        for (int i = 0; i <= n ; i++){
            // swap the position of a[i] to a[l - 1 -i]
            temp = arr[i];
            arr[i]= arr [l - i - 1];
            arr [l - i - 1] = temp;
        }
        for (int element: arr){

            System.out.print(" " +element);
        }
    }
}
