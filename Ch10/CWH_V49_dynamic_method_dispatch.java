class One{
    public void greet(){
        System.out.println("Good morning");
    }

    public void name(){
        System.out.println("My name is Java");
    }
}

class Two extends One{
    public void welcome(){
        System.out.println("You are welcome");
    }

    public void name(){
        System.out.println("My name is Java in class 2");
    }
}

public class CWH_V49_dynamic_method_dispatch {
    static void main(String[] args) {
//        One obj = new One();
//        Two obj2 = new Two();
//        obj.name();
//        obj2.welcome();

        One obj = new Two();
        obj.name();
        obj.greet();



    }
}
