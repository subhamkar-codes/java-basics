class Ekcalss{
    int a;

    public int getA() {
        return a;
    }

    Ekcalss(int v){
        a = v;
    }
public int returenone(){
    return 1;
}

}

class Doclass extends Ekcalss{
    Doclass (int c){
        super(c);
        System.out.println("I am a constructor of Doclass");
    }
}
public class Cwh_V47_this_class {
    static void main(String[] args) {
    Ekcalss e = new Ekcalss(5);
    Doclass d = new Doclass(7);
        System.out.println(e.getA());

    }
}
