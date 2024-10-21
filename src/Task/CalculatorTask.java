package Task;

import java.util.Scanner;

public class CalculatorTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number and Sign to perform task");
        int num = sc.nextInt();
        int num1 = sc.nextInt();
        String sign = sc.next();

        switch(sign)
        {
            case "+"->
                System.out.println("Addition of Two number are :" +(num+num1));

            case "-" ->
                System.out.println("Substraction of Two are :" +(num-num1));
            case "*" ->
                System.out.println("Multiplication of Two number are " +(num*num1));
            case "/" ->
                    System.out.println("Division of Two number are " +(num/num1));
            case "%" ->
                    System.out.println("Modulus of Two number are " +(num%num1));
            default -> System.out.println("Doesnt Find this sign");
        }


    }

}
