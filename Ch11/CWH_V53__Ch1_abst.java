abstract class parent2{
    public parent2(){
        System.out.println("I am a constructor of base2");
    }
    public void SayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();

}

    class child2 extends parent2{
    public void greet(){
        System.out.println("Good morning");
    }
        public void greet2(){
            System.out.println("Good afternoon");
        }
}
abstract class child3 extends parent2{
    public void th(){
        System.out.println("I am good");
    }
}

public class CWH_V53__Ch1_abst {
    static void main(String[] args) {
        child2 c = new child2();
            c.greet();
            c.greet2();

    }
}
