package Oct.exe_17102024;

import java.util.Scanner;

public class GradeProg {
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SCORE TO CHECK THE GRADE:");
    int score=sc.nextInt();
    if(score<=100 && score>=90)
    {
        System.out.println("GRADE A");
    } else if (score >=80 && score <=89)
    {
        System.out.println("GRADE B");
    }
   else if(score>=70 && score <=79)
    {
        System.out.println("GRADE C");
    } else if (score >= 60 && score <=69)
    {
        System.out.println("GRADE D");
    }
   else if(score<=0 || score >100)
   {
       System.out.println("Score should be less than 100 and more or equal to 0");
   }
   else {
        System.out.println("GRADE F");
    }
    }
}
