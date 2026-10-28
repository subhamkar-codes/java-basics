abstract class pen{
    abstract void write();
    abstract void refill();
}
class FoumtainPen extends pen{
    public void write(){
        System.out.println("Writing....");
    }
    public  void refill(){
        System.out.println("Refilling the pen.....");
    }
    public void ChangeNib(){
        System.out.println("Changing the the Nib....");
    }
}

//CWH_V60_Ch11_PS_p
public class CWH_V60_Ch11_PS_p1Andp2 {
    static void main(String[] args) {
        FoumtainPen fp = new FoumtainPen();
        fp.write();
        fp.ChangeNib();
        fp.refill();
    }
}
