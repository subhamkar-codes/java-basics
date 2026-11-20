import java.util.Scanner;
class MyNewThr1 extends Thread {
        int i = 0;

    public void run() {
        while (i< 54564) {
            System.out.println("Hey !! THANK U " + this.getName());
            // System.out.println("i am a Thread");
            i++;
        }
    }

}

class MyNewThr2 extends Thread {
    int i = 0;
    public void run() {
        while (i < 75964) {
            System.out.println("Hey !!" + this.getName());
            // System.out.println("i am a Thread");
            i++;
        }
    }

}







public class CWH_V75_ThreadMethod {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyNewThr1 tr1 = new MyNewThr1();
        MyNewThr2 tr2 = new MyNewThr2();
        tr1.start();
        try {
        tr1.join();

        }catch (Exception e){
            System.out.println(e);
        }
        tr2.start();

    }


}
