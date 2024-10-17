package Oct.exe_17102024;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int a1= sc.nextInt();
       if(a1%2==0)
       {
           System.out.println("Even in nature");
       }
        else
       {
           System.out.println("Number is Odd");
       }
    }
}
