public class CWH_V32_Ch7_method {
    static void foo(){
        System.out.println("good morning");
    }
    static void  foo(int a){
        System.out.println("Good morning " + a + " bro!!");
    }
    static void  foo(int a , int b){
        System.out.println("Good morning " + a + " bro!!");
        System.out.println("Good morning " + b + " bro!!");
    }

    static void chamge(int a){
        a = 98;
    }
    static void change2(int [] arr){
        arr [0] = 98;
    }

    static void telljoke(){
        System.out.println("dsjkgfuhea oiehuifa");
    }
    static void main(String[] args) {
             //   telljoke();
        // case 1: changing the integer
//        int x = 45;
//        chamge(x);
//        System.out.println(x);
//
//        //case 2: changing the array
//        int [] marks = {45, 60, 64, 53, 18};
//        change2(marks);
//        System.out.println("After changing the value of arr[0] is "+marks[0]);

        // method overloading
            foo();
            foo(2);
            foo(3,4);



    }
}
