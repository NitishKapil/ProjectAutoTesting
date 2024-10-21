package Task;

import java.util.Scanner;

public class MonthProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the imput from 1-12 to find the month");
        int num= sc.nextInt();
        switch (num)
        {
   case 1 ->System.out.println("Month is January");
   case 2 ->System.out.println("Month is February");
  case 3 ->System.out.println("Month is March");
  case 4 ->System.out.println("Month is April");
  case 5 ->System.out.println("Month is May");
  case 6 ->System.out.println("Month is June");
  case 7 ->System.out.println("Month is July");
  case 8 ->System.out.println("Month is August");
  default -> System.out.println("No. such monht number");
        }

    }
}
