package Task;

import com.sun.jdi.IntegerValue;

public class lab1610Argument {
    public static void main(String[] args) {
        int num1= Integer.parseInt(args[0]);
        int num2= Integer.parseInt(args[1]);
        System.out.println(num1>num2?num1:num2);
    }
}
