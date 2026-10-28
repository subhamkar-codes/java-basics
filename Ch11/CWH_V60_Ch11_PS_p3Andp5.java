class monkey{
  void jump(){
      System.out.println("Jumping..");
  }
  void bite(){
      System.out.println("Bitting...");
  }
}
interface basicAnimal{
   void eat();
   void sleep();
}

class Human extends monkey implements basicAnimal{
    void speak(){
        System.out.println("Hello Sir!!");
    }
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }


}

public class CWH_V60_Ch11_PS_p3Andp5 {
    static void main(String[] args) {
        Human hm = new Human();
        hm.speak();
        hm.bite();
        hm.jump();
        hm.eat();
        hm.sleep();

        monkey m1 = new Human();
        m1.bite();
        m1.jump();
    }
}
