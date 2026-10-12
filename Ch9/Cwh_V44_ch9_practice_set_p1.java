
class Cylinder {
    private int radious;
    private int hight;



    public int getRadious() {
        return radious;
    }

    public void setRadious(int radious) {
        this.radious = radious;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public double surfaceArea(){
        return 2*3.14*radious*radious+2*3.14*radious*hight;
    }
    public double volume(){
        return Math.PI*radious*radious*hight;
    }

}
public class Cwh_V44_ch9_practice_set_p1 {
    static void main(String[] args) {
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHight(12);
        myCylinder.setRadious(9);

       int h=  myCylinder.getHight();
        System.out.println(h);


        int r =  myCylinder.getRadious();
        System.out.println(r);

        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());
    }
}
//Cwh_V44_ch9_practice_set_p