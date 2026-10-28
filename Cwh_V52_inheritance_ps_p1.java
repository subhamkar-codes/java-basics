import java.util.Scanner;

//Cwh_V52_inheritance_ps_p
    class circle{
    public int radius;
    circle(int r){
//   System.out.println("I am in circle class");
        this.radius = r;
    }
    public double area(){
        return Math.PI * this.radius * this.radius;
    }
}
class cylinder extends circle{
    public int height;

    cylinder(int r , int h){
        super(r);
        this.height = h;

    }
    public double volume(){
        return Math.PI * this.radius * this.radius * height;
    }
}
public class Cwh_V52_inheritance_ps_p1 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your r");
        int r = sc.nextInt();
        System.out.println("Enter your h");
        int h = sc.nextInt();
//-------------------------------------------------------------------\\
        circle cr = new circle(r);
        cylinder cy = new cylinder(r ,h);
        System.out.println("The area of circle is "+ cr.area());
        System.out.println("The volume of cylinder is "+cy.volume());
    }

}


