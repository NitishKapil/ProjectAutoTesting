package Generic;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        List<String> li = new ArrayList();
        li.add("karan");
        li.add("nitish");
        li.add("Shubham");
        System.out.println(li);
        li.add(0, "karan kapil");
        for (String s : li) {
            System.out.println(s);
                                }
        System.out.println("fetch element->" + li.get(2));
        li.set(1, "nitish kapil");
        System.out.println(li);
        li.remove(2);
        System.out.println(li.contains("shubham"));
        Collections.sort(li);
        System.out.println(li);
        Collections.shuffle(li);
        System.out.println(li);
        li.subList(1,3);

        Collections.swap(li,0,2);

   for(String b : li)
   {
       System.out.println(b);
   }
    }
}
