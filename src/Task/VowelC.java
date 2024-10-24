package Task;

public class VowelC {
    public static void main(String[] args) {
    String vowel ="Kapil Desi";
    int count1 = vowel.length();
    int b=1;
    for(int a=0;a<count1;a++)
    {
       if(vowel.charAt(a)=='a' || vowel.charAt(a)=='e' || vowel.charAt(a)=='i' || vowel.charAt(a)=='o' || vowel.charAt(a)=='u')
       {
           System.out.println(vowel.charAt(a));
           System.out.println(a);
           System.out.println("Total number of vowels are " +b++);
       }
    }

}}
