class mymainEmployee{
    public mymainEmployee(){
        id = 14;
        name = "subham BKL";
    }

    private int id;
    private String name;

    public String getName(){
    return  name;}

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
}

public class CWH_V41_ch9_construct {
    static void main(String[] args) {
        mymainEmployee subham = new mymainEmployee();

//        subham.setName("Subham_kar");
//        System.out.println(subham.getName());
//        subham.setId(13254);
//        System.out.println(subham.getId());
        System.out.println(subham.getName());
        System.out.println(subham.getId());


    }
}
