public class CWH_V31_Ch7_method {
    static int logic (int x , int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return  z;
    }
    static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = logic(a , b);
        System.out.println(c);

        int d = 9;
        int e = 8;
        int f = logic(d , e);
        System.out.println(f);
    }
}
