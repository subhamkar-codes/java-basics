import java.util.Scanner;

interface bicycle{
    int a = 45;
    void applyBreak(int decrement);
    void speedUp (int increment);
}
interface HornBicycle{
    void blowHornK3g();
    void blowHorntmkc();
}

class AvonCycle implements bicycle , HornBicycle{
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo!!");
    }
   public void applyBreak(int decrement){
        System.out.println("Applying Break");
    }
   public void speedUp (int increment){
        System.out.println("Speeding Up");
    }
   public void blowHornK3g(){
       System.out.println("Blowing Horn of K3G");
   }

    @Override
    public void blowHorntmkc() {
        System.out.println("Blowing horn of TMKC");
    }
}

public class CWh_V55_ch11_DiffOfAbstAndInterface {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AvonCycle av = new AvonCycle();
        int a = sc.nextInt();
        int b = sc.nextInt();
        av.speedUp(a);
        av.blowHorn();
        av.blowHornK3g();
        av.blowHorntmkc();
        av.applyBreak(b);
    }
}
