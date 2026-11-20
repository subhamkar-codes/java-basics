class c1{
public  int x = 5;
 protected int y = 45;
 int z = 65;
 private int a = 75;

 public void meth1(){
     System.out.println(x);
     System.out.println(y);
     System.out.println(z);
     System.out.println(a);
 }
}
class c2{

}
class c3{

}


public class CWH_V66_AccessModifiers {
    static void main(String[] args) {
        c1 c = new c1();
        c.meth1();
    //    System.out.println(c.a); --> this will throw an error
    }
}
