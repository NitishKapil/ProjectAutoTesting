package Programme250;

import java.util.Scanner;

public class FizzBUzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER->");
        int num = sc.nextInt();

        if(num%3==0)
        {
            System.out.println("FIZZ");
        }
     else if (num %5==0)
        {
            System.out.println("BUZZ");
        } else if (num%3==0 && num%5==0)
        {
            System.out.println("FIZZBUZZ");
        }
    else
        {
            System.out.println("Number is neither FIZZ or FIZZBUZZ or BUZZ" +num);
        }
    sc.close();
    }



}
