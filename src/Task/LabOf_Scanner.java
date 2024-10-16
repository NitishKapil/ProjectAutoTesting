package Task;

import java.util.Scanner;

public class LabOf_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int age = scanner.nextInt();
        System.out.println(age>34?"allowed to go goa" : "allowed not to goa");
        System.out.printf("%d" ,age);
    }
}
