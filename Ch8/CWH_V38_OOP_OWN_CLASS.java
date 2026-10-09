class employee1{
    int id;
    float salary;
    String name;
    public void printingDetails(){
        System.out.println("Employee name is " + name);
        System.out.println("Employee id is "+id);
       // System.out.println("Salary is "+salary);
    }
    public float getSalary(){
        return salary;
    }
}

public class CWH_V38_OOP_OWN_CLASS {
    static void main(String[] args) {
        System.out.println("This is our custom Class");
        employee1 subham = new employee1(); //Instantiating a new Employee Object
        employee1 harry = new employee1(); //Instantiating a new Employee Object

        // Setting attribute
        subham.name = "Student_subham";
        subham.id = 14;
        subham.salary =60000f;

        harry.name = "Code_with_harry";
        harry.id = 12;
        harry.salary=60000f;

        //Printing the Attributes
        subham.printingDetails();
        System.out.println();
        harry.printingDetails();
        float salary = harry.getSalary();
        System.out.println(salary);
//        System.out.println(subham.name);
//        System.out.println(subham.id);
//
    }
}
