
class Cellphone{
    public void ringing(){
        System.out.println("Ringing.....");
    }

    public void vibrating(){
        System.out.println("vibrating.....");
    }
    public void callFriend(){
        System.out.println("Calling friend.....");
    }
}


public class WH_V39_Ch8_PS_P2 {
    static void main(String[] args) {
        Cellphone asus = new Cellphone();
        asus.callFriend();
        asus.ringing();
        asus.vibrating();

    }
}
