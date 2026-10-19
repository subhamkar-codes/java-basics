class base1{
    base1(){
        System.out.println("main akk constructor hoon");
    }

    base1(int x){
        System.out.println("I am a overloded constructor with the value of x: " + x);
    }


    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived1 extends base1{
    Derived1(){
        super(0);
        System.out.println("I am a derive class constructor");
    }

    Derived1(int x , int y){
        super(x);
        System.out.println("i am a derive class constructor with value of y is: " +y);
    }

    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }

    ChildOfDerived(int x, int y , int z){
        super(x,y);
        System.out.println("i am a derive class constructor with value of z is: " +z);
    }

}

public class Cwh_V46_CH10 {
    static void main(String[] args) {

//        base1 b = new base1();
//        Derived1 d = new Derived1();
//        Derived1 d = new Derived1(3,5);
        ChildOfDerived d = new ChildOfDerived(3,4,5);

    }
}
