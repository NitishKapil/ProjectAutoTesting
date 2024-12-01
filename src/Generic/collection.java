package Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class collection {
    public static void main(String[] args) {

         List arr = new ArrayList();
        arr.add("karan");
        arr.add("12");
        arr.add(12);
        for (Object o : arr) {
            System.out.println(o);
        }
        System.out.println(arr);
        System.out.println(arr);
        arr.add(0,"kapil");//add an element
        System.out.println(arr);
        System.out.println(arr.get(0));//get element of specific index
        System.out.println(arr.set(1,"RAm"));// update an element
        System.out.println(arr);
        System.out.println(arr.remove(0));//remove the element
        System.out.println(arr);
        System.out.println(arr.contains("kapil"));//search
        List<String> list = new ArrayList<String>();
        list.add("6");list.add("2");list.add("karan kapil");
        Collections.sort(list);
        System.out.println(list);
        List<String> list1 = new ArrayList<String>();
        list1.add("kai");list1.add("poo");
        for(String e : list1)
        {
            System.out.println(list);
            System.out.println(list.contains(list1));
        }
        Collections.copy(list,list1);
        System.out.println(list);
        System.out.println(list1);



      /*  for (String a : arr)
        {
            System.out.println(a);
            System.out.println(arr.size());
        }*/

        //temp_sum(23, 87);
    }

    private static <T> T temp_sum(T a, T b) {
        System.out.println(a);
        System.out.println(b);
        return null;
    }

}
