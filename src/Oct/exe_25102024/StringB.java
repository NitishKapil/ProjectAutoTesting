package Oct.exe_25102024;

import java.util.*;
import java.lang.String;
public class StringB {
    public static void main(String[] args) {
  /*String-> sequence of characters and non-primitive  datat type
   lenght of string and pre defined class and string are constant in nature there value are not
   it is final class and u cannot inheritance it and cannot created the child class
   mutable
   immutable->which cannot be change
   string are stored in jvm
   1.String String buffer,string builder
   */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name more than of three words");
        String name = sc.next();
        System.out.print("Mid character of " + name + " is ");
        MidChar(name);
       //system.out.println(t);
    }

    static void MidChar(String name) {

        int n = name.length();
        if (n % 2 == 0) {
            int even = n / 2;
            int even1 = even - 1;
            System.out.println(name.charAt(even1) + " and " + name.charAt(even ));

        } else
        {
            int even = n / 2;

            System.out.println(name.charAt(even));
        }




    }
}
