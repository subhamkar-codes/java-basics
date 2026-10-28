interface Mycamera2 {
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default  void record4kVideo(){
        greet();
        System.out.println("Recording Video in 4k....");
    }
}
interface Mywifi2{
    String[] getNetwork();
    void connectToNetwork(String Network);
}
class MyCellPhone2{
    void CallNumber(int Number){
        System.out.println("Calling " + Number);
    }
    void PickCall(){
        System.out.println("Picking up the call.....");
    }

}


class MySmartPhone2 extends MyCellPhone2 implements Mycamera2, Mywifi2{
    public  void takeSnap(){
        System.out.println("Taking a snap!!");
    }
    public void recordVideo(){
        System.out.println("Recording Video...");
    }
    public String [] getNetwork(){
        System.out.println("Getting the List of Network");
        String[] NetworkList = {"Harry" , "Subham" , "Susanta"};
        return NetworkList;
    }
    public void connectToNetwork(String Network){
        System.out.println("Connecting to the Network..." + Network);
    }
    public void sempMeth(){
        System.out.println("Meth");
    }
}
public class CWH_V59_Ch11_Polymorphism {
    static void main(String[] args) {
        Mycamera2 cam1 = new MySmartPhone2();
        cam1.record4kVideo();

        MySmartPhone2 s = new MySmartPhone2();
    //      s.connectToNetwork();
        s.getNetwork();
        s.recordVideo();
        s.sempMeth();
        s.takeSnap();
        s.CallNumber(9862452);
        s.PickCall();

    }
}
