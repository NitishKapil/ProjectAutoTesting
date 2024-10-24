package Oct.exe_22102024;

public class WhileLoop {
    public static void main(String[] args) {
        int a = 10;
        String b = args[0];
        int age = Integer.parseInt(b);
        System.out.println(age);
        while (age > 0) {
            System.out.println(a);
            age--;
        }
    }

}
