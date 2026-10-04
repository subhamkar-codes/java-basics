public class CWH_V29_PS_ARRAY_p4 {
    static void main(String[] args) {
        int [][] arr1 = {{1,2,3} ,
                        {4,5,6}};
        int [][] arr2 = {{7,8,9} ,
                         {9,8,7}};
        int [][] arr3 = {{0,0,0} ,
                         {0,0,0}};
        for (int i = 0;i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){

                arr3 [i][j]= arr1[i][j]+arr2[i][j];
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
