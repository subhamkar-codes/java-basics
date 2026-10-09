import java.util.Scanner;

class sQuar{
    int side;
    public int area() {
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}


public class CWH_V39_Ch8_PS_P3 {
    static void main(String[] args) {
         sQuar sr = new sQuar();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your side: ");
        int a = sc.nextInt();
        sr.side = a;
        System.out.println(sr.area());
        System.out.println(sr.perimeter());
    }
}
