
class employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;

    }

    public void setName(String n){
        name = n;
    }

}

public class CWH_V39_Ch8_PS_P1 {
    static void main(String[] args) {
        employee subham = new employee();
        subham.setName ("Subham Kar");
        System.out.println(subham.getName());

        subham.salary= 30864;
        System.out.println(subham.getSalary());
    }
}

//CWH_V39_Ch8_PS_P