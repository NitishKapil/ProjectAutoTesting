package Generic;

import java.util.ArrayList;
import java.util.List;

public class MainToSetValue {
    public static void main(String[] args) {

        GetterSetter gs = new GetterSetter("kapil",12);
        System.out.println(gs);
        GetterSetter gs1 = new GetterSetter("kapil",13);
         gs.setAge(12);
         gs.setName("kq");
        List <GetterSetter>std = new ArrayList();
       std.add(gs);
       for(GetterSetter s : std)
       {
           System.out.println(s.getAge());
       }
    }
}
