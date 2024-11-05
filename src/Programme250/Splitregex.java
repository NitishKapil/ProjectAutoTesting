package Programme250;

public class Splitregex {
    public static void main(String [] args)
    {
    /*    String word = "Welcome,to india,with parent";
        String [] splt= word.split("," , 2);
        System.out.println(splt[0]);
        for(String n :splt) {
            System.out.println(n);
        }
*/
    String removeSpace ="Welcome to India";
        removeSpace=removeSpace.replaceAll("\\s", "");
      System.out.println(removeSpace);


      String name ="Kapil hello how are u";
      String []name1= name.split("\\s");
      int len = name1.length;
      System.out.println(len);






    }}
