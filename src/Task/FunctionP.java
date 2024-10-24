package Task;

import java.util.Scanner;

public class FunctionP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  value of A and B:->");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum1 = sum(a,b);
        System.out.println("sum of two number is:= " +sum1);
        int sub1 = sub(a, b);
        System.out.println("sub of two number is:= " +sub1);
    }

    static int sum(int a, int b) {
        int c =Math.addExact(a,b);
        return c;
    }
    static int sub(int a, int b) {
        return a - b;
    }
    static int mul(int a, int b) {
        return a * b;
    }
    static int div(int a, int b) {
        return a / b;
    }
}

