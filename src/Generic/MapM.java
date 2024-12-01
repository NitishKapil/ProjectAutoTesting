package Generic;

import java.util.HashMap;
import java.util.Map;

public class MapM {

    public static void main(String[] args) {
        Map <String,Object> m = new HashMap();
        m.put("name", "karan");
        m.put("id", 12);
        m.put("fee",1200);
        m.put("school","karan");

        for(Map.Entry<String,Object> item: m.entrySet())
        {
            System.out.println(item.getValue()+ "->" +item.getKey());
        }


        System.out.println(m);//data
        System.out.println(m.size());//size
        System.out.println(m.isEmpty());
        System.out.println(m.containsKey("id"));
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.get("id"));


    }
}
