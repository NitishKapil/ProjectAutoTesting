package Programme250;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check leap year or Not");
         int year = sc.nextInt();
         boolean isLeap = false;

         if((year%4==0 && year%100!=0) || (year%400==0))
         {
             isLeap=true;

         }
         if(isLeap==true)
         {
             System.out.println("This is leap year");
         }
         else
         {
             System.out.println("Not leap year");
         }
    }

}
