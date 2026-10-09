class Tommy{
    public void hit(){
        System.out.println("Hitting.....");

    }
    public void shoot(){
        System.out.println("Shooting....");
    }
    public void run(){
        System.out.println("Running....");
    }
}

public class CWH_V39_Ch8_PS_P5 {
    static void main(String[] args) {
     Tommy p1 = new Tommy();
     p1.hit();
     p1.run();
     p1.shoot();
    }
}
