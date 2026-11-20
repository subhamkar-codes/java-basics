class MyThr extends Thread {
    public MyThr(String name) {
        super(name);
    }

    public void run() {
//        while (true) {
//            System.out.println("i am a Thread");
//        }
    }

}


public  class CWH_V73_ThreadConstructor {
    static void main(String[] args) {

        MyThr t = new MyThr("Subham");

        t.start();
        System.out.println(t.getId());
        System.out.println(t.getName());
    }
}

