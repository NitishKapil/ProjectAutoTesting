package Task;

import java.util.Scanner;

public class Task1610_UserInput {
    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);
        System.out.println("Enter the age") ;
         int age= scannner.nextInt();
        System.out.println("Enter the name of employee");
         String name=scannner.next();
         System.out.println("Enter the salary");
         double salary =scannner.nextDouble();

        System.out.println("Total salary of this age person is " +(age + age));
        scannner.close();
    }
}
