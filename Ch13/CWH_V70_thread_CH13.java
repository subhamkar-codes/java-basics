import java.util.Scanner;

class MyThread extends Thread{

    @Override
    public void run(){
        while (true){
        System.out.println("My thread is running and I am happy");
            System.out.println("Am i really happy");

        }

    }
}

class MyThread2 extends Thread{

    @Override
    public void run(){
        while (true){
            System.out.println("My thread 2 is running");
            System.out.println("I think i am not");
        }
    }

}



public class CWH_V70_thread_CH13 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();

    }
}
