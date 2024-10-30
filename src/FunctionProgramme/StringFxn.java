package FunctionProgramme;

import java.util.Scanner;

public class StringFxn {

   static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        String lastIndex = sc.next();

    }

    static String CharAt1(String name) {
        int last = name.length();
        System.out.println(last);
        String name2 = name.charAt(1) + "" + name.charAt(last-1);
        return name2;
    }

    static String Concat1(String Concat) {
        Concat = Concat.concat(sc.next());
        return Concat;
    }

    static Boolean containsM(String contain1) {
        boolean cond = contain1.contains(sc.next());
        return cond;
    }

    static Boolean endsWithM(String enswith1) {

        Boolean end = enswith1.endsWith("ve");
        return end;
    }
static int lastIndexM(String lastIndex)
{
    int last=lastIndex.lastIndexOf("w");
    return last;
}


}
