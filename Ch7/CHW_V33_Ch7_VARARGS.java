public class CHW_V33_Ch7_VARARGS {
//    static int sum (int x , int y){
//        return x + y;
//    }
    static  int sum (int ...arr){
        int result = 0;
        for (int a : arr){
            result += a;
        }
        return result;
    }
    static void main(String[] args) {
        System.out.println("Welcome varargs tutorial!!");
        System.out.println("The value of the sum is "+ sum(4 , 7));
        System.out.println("The value of the sum is "+ sum(4 , 7, 5 , 10));
    }
}
