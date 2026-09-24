import java.util.Locale;

public class CWH_14_String_method {
    static void main() {
        String a = "harry";
        String b = new String("Subham");
        System.out.println(a + " and " +b + " is friend ");

        String name = "Happy";
        //1
        int value = name.length();
        System.out.println(value);
        //2
        String vlaue2 = name.toLowerCase();
        System.out.println(vlaue2);
        //3
        String value3 = name.toUpperCase();
        System.out.println(value3);
        //4
        String nonTrinmmedstring = "     Subham     ";
        System.out.println(nonTrinmmedstring);
        String trimed = nonTrinmmedstring.trim();
        System.out.println(trimed);
        //5
        String subs = name.substring(3);
        System.out.println(subs);
        String subs2 = name.substring(1,4);
        System.out.println(subs2);
        //6
        String rpls = name.replace("p", "r");
        System.out.println(rpls);
        //7
        System.out.println(name.startsWith("hap"));
        System.out.println(name.endsWith("py"));
        //8
        int char2 = name.charAt(0 );
        System.out.println(char2);
        //9
        int idx = name.indexOf("py");
        System.out.println(idx);
        //10
        String moddifiedname = "harryrry";
        System.out.println(moddifiedname.indexOf("rry",4));
        //11
        System.out.println(moddifiedname.lastIndexOf("ry",4));
        //12
        boolean eul = name.equals("Happy");
        System.out.println(eul);
        //13
        boolean eul2 = name.equalsIgnoreCase("happy");
        System.out.println(eul2);
    }
}
