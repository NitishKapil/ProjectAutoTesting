package Oct.Encapsulation;

public class setValue {
    public static  void main(String args[])
    {
       /* Encap setV = new Encap();
        setV.setName("Kapil");
        setV.setAge(12);
        setV.setName("nitish");
         System.out.println(setV.getName());
         System.out.println(setV.address1);
*/
         Setup s = new Setup();
         String name = s.getName();
         System.out.println(name);
    }
}
