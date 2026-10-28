interface Mycamera {
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
interface Mywifi{
    String[] getNetwork(); 
    void connectToNetwork(String Network);
}
class MyCellPhone{
    void CallNumber(int Number){
        System.out.println("Calling " + Number);
    }
    void PickCall(){
        System.out.println("Picking up the call.....");
    }

}


class MySmartPhone extends MyCellPhone implements Mycamera, Mywifi{
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
}

public class CWH_V57_Ch11_default {
    public static void main(String[] args) {
       MySmartPhone ms = new MySmartPhone();
       ms.takeSnap();
       ms.recordVideo();
       String [] ar = ms.getNetwork();
       for (String item : ar) {
        System.out.println(item); 
       }
       ms.connectToNetwork(null);
       ms.record4kVideo();
    }
    
}
