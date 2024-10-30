package Oct.exe_28102024;

public class StringFxn {
    public static void main(String[] args) {
        String name = "kapil,nanu";
        System.out.println(name.substring(0, 5));// usesd in many interview questions
        //  System.out.println(name.concat("nitish"));
        String[] name1 = name.split(",");
        System.out.println(name1[0]);
        System.out.println(name1[1]);
        System.out.println(name.charAt(4));
        String nme = "kapil $pkumar";
        System.out.println(nme.trim());
        System.out.println(nme.indexOf('p'));
        System.out.println(nme.lastIndexOf('p'));
        System.out.println(nme.contains("p"));
        System.out.println(nme.replace('p', 'z'));
        System.out.println(nme.replaceAll("p", "z"));
        System.out.println(nme.startsWith("k"));


        /*String buffer*/
        StringBuffer str = new StringBuffer("Hello");
        str.append("World");
        str.reverse();
        System.out.println(str);

        StringBuilder str1 = new StringBuilder("Karan");
        str1.append("kapil");
        System.out.println(str1);

        System.out.println(str1.charAt(2));

    }
}
