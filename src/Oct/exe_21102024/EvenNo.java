package Oct.exe_21102024;

import java.util.Scanner;

public class EvenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER the Number to find the even number");
        int i= 1;
        int j= sc.nextInt();
        for (; i < j; i++) {
            if(i%2==0)
            {
                System.out.print(i +",");

            }
          //  System.out.println(i);
        }
    }
}
