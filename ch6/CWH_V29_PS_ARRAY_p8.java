public class CWH_V29_PS_ARRAY_p8 {
    static void main(String[] args) {
        int [] arr = {-128 ,1, 2 ,3, 4 , 5 , 6 , 75,97};
        boolean isShorted = true;
        for (int i = 0 ; i < arr.length - 1; i++){
            if (arr[i] > arr[i+1]){
               isShorted = false;
               break;
            }
        }
        if (isShorted){
            System.out.println("Tha array is shorted");
        }
        else {System.out.println("The array is not shorted");

        }
    }
}
