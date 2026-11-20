import java.util.Scanner;
//CWH_ch13_ps
class  p13 extends Thread{
    int i =0;
    @Override
    public void run() {
        while (i <= 100){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println("Hello! Good morning");
            i++;
        }

    }
}
class  p13a extends Thread{
    int i = 0;
    @Override
    public void run() {
        while (i <= 100){

            System.out.println("Hello! Wellcome");
            i++;
        }
    }
}

public class CWH_ch13_ps1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            p13 p = new p13();
            p13a o = new  p13a();
             p.start();
             p.setPriority(9);
             o.start();
            o.setPriority(6);

        System.out.println(p.getPriority());
        System.out.println(o.getPriority());
        System.out.println(p.getState());
        System.out.println(o.getState());
        System.out.println(Thread.currentThread().getState() );

    }
}
