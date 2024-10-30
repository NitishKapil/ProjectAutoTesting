package Task;

public class VowelC {
    public static void main(String[] args) {
    String vowel ="Kapil Desi";
    int count=VowelC1(vowel);
    System.out.println(count);
}
static int VowelC1(String vowel)
{
    int count1=vowel.length();
    int b =0;
    for(int a=0;a<count1;a++)
    {
        if(vowel.charAt(a)=='a' || vowel.charAt(a)=='e' || vowel.charAt(a)=='i' || vowel.charAt(a)=='o' || vowel.charAt(a)=='u')
        {
          b++;

        }
    }
    return b;
}

}
