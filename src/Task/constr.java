package Task;

import java.util.Locale;



public class constr {
      String name;

    constr()
    {
        this("itish");
        this.name="kapil";
        System.out.println(name);
    }
    constr(String name)
    {
        this.name= name;
       System.out.println(name);
    }
}
class Tocall
{
    public static void main(String args[]) {
        constr obj = new constr();

    }
}