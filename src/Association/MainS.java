package Association;


import java.util.*;

public class MainS {
    public static void main(String[] args) {
       /* StudentGS gs = new StudentGS();
        StudentS s = new StudentS();
        s.Add(gs);
        System.out.println(gs.getName());
*/
       /* int[] numbers = {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};

        Map<Integer, Integer> m = new HashMap<>();
        {
        for(int number : numbers)
        {
            m.put(number,m.getOrDefault(number,0)+1);

        }
            System.out.println(m);
            System.out.println(m.size());

        for(Map.Entry<Integer,Integer> item : m.entrySet())
        {
            System.out.println("Getkey:"+item.getKey() + " getValue ->" +item.getValue());
        }
        }*/
        int[] numbers = {1, 2, 3, 4, 5, 1, 2};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int number : numbers) {
            if (!seen.add(number)) {
                duplicates.add(number);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }




}



