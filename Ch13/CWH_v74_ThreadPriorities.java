import java.util.Scanner;

class MyThr1 extends Thread {
    public MyThr1(String name) {
        super(name);
    }

    public void run() {
         while (true) {
        System.out.println("Hey !!" + this.getName());
          // System.out.println("i am a Thread");
      }
    }

}



public class CWH_v74_ThreadPriorities {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ready Queue T1 T2 T3 T4 T5

        MyThr1 thr1 = new MyThr1("Subham");
        MyThr1 thr2 = new MyThr1("Harry");
        MyThr1 thr3 = new MyThr1("Harry2");
        MyThr1 thr4 = new MyThr1("Harry3");
        MyThr1 thr5 = new MyThr1("Harry4 (most important)");

        thr5.setPriority(Thread.MAX_PRIORITY);
        thr4.setPriority(Thread.MIN_PRIORITY);
        thr3.setPriority(Thread.MIN_PRIORITY);
        thr2.setPriority(Thread.MIN_PRIORITY);
        thr1.setPriority(Thread.MIN_PRIORITY);

        thr1.start();
        thr2.start();
        thr3.start();
        thr4.start();
        thr5.start();


    }
}
