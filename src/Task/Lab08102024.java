package Task;

import Oct.exe_03092024.Lab001;

import static Oct.exe_03092024.Lab001.add;

public class Lab08102024 {


    public static void main(String[] args) {

        int a= 251;
        byte b = (byte) a;
        System.out.println(b);
        String result = a>12? "Large number" : "Smaller number";
        System.out.println(result);
        int a1=12;int b1=13;
        int max= a1<b1? a1:b1;
        System.out.println(max);

        int score =13;
   int name = (score>90)? score: (score>80) ? 10: 12;
        System.out.println(name);

        char a2= 'a';
        System.out.println(++a2);

        System.out.println(a2);

       }
}
