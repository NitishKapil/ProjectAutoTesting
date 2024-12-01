package Programme250;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class ListP {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<Integer>(Arrays.asList(1,3,5));
        List<Integer> li1 = new ArrayList<>(Arrays.asList(2,4,6));


        List<Integer> li3 = new ArrayList<>();
        li3.addAll(li);
        li3.addAll(li1);
        System.out.println(li3);
        Collections.sort(li3);
        System.out.println(li3);

    }

}
