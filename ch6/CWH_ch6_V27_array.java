public class CWH_ch6_V27_array {
    static void main(String[] args) {

//        float [] height = {5.6f, 6.1f, 5.9f ,5.4f, 5.11f};
//        String [] name = {"Subham" , "sayan" , "arnab", "ajay" , "ankan"};
//        System.out.println(height.length);
//        System.out.println(name.length);
//        System.out.println(height[0]);
//        System.out.println(name[0]);

        int [] marks = {100, 75, 85, 95, 65};
//        System.out.println(marks.length);
        // display in naive way.................
//        System.out.println("display in naive way.................");
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);

        // display array using loop......
//        System.out.println("display array using loop......");
//        for (int i = 0; i < marks.length; i++){
//            System.out.println(marks[i]);
//        }
//
//        System.out.println("practice problem , printing array in reverse order");
//        for (int i = marks.length - 1; i >= 0; i--){
//            System.out.println(marks[i]);
//        }

        // for each loop for array......
        System.out.println("Printing using for-each loop using array");
        for (int element: marks){
            System.out.println(element);
        }


    }
}
