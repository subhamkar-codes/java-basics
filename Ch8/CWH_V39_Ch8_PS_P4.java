import java.util.Scanner;

class rectangel{
    int a;
    int b;
    public int area(){
        return a*b;
    }
    public int perimeter(){
        return 2*(a*b);
    }
}


public class CWH_V39_Ch8_PS_P4 {
    static void main(String[] args) {
        rectangel ra = new rectangel();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your width: ");
        int w = sc.nextInt();
        ra.a = w;
        System.out.println("Enter your length: ");
        int l = sc.nextInt();
        ra.b = l;
        System.out.println(ra.area());
        System.out.println(ra.perimeter());
    }
}
