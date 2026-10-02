public class CWH_V24_break_continue {
    public static void main(String[] args) {
// break and continue using loops
//        for (int i = 0; i < 5; i++){
//            System.out.println(i);
//            System.out.println("Java is great");
//            if (i == 2){
//                System.out.println("Ending the loop!!");
//                break;
//            }
//
//        }
//        System.out.println("Loop ends here");
        // continue


        for (int i = 0; i < 5; i++){

            if (i == 2){
                System.out.println("Strating the loop!!");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
       }
        System.out.println("Loop ends here");

    }

}
