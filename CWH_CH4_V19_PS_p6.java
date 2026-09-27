import java.net.SecureCacheResponse;
import java.util.Scanner;

public class CWH_CH4_V19_PS_p6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your URL: ");
        String url = sc.nextLine();
        if (url.endsWith(".com")){
            System.out.println("This is a commercial Website");
        } else if (url.endsWith(".org")) {
            System.out.println("This is a organization Website");
        } else if (url.endsWith(".in")) {
            System.out.println("This is a Indian website");
        }
        else {
            System.out.println("Your URL is wrong!!");
        }
    }
}
