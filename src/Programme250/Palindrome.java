package Programme250;

public class Palindrome {
    public static void main(String args[])
    {
    String name = "kapil";
   int count = name.length();
     String rev="";
   for(int i=4; i>=0;i--)
   {
       rev = rev +name.charAt(i);

   }
        System.out.println(rev);


    }
}
