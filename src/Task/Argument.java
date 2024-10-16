package Task;

public class Argument {
    public static void main(String[] args) {
        int age= Integer.parseInt(args[0]);
        System.out.println(age>12?"allowed to goa" : "Not allowed");
        System.out.println(args[2]);
        System.out.println(args[1]);
        System.out.println(age);
        System.out.printf("%s %s", args[0], args[1]);
    }
}
