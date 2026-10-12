class myEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
    public void setId(int x){
        id = x;
    }

    public int getId(){
        return id;
    }
}

public class CWH_V40_CH9_ACCM {
    static void main(String[] args) {
        myEmployee subham = new myEmployee();

        subham.setId(145263);
        System.out.println(subham.getId());

        subham.setName("Subham_Student");
        System.out.println(subham.getName());

    }
}
