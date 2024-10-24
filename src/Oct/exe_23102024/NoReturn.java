package Oct.exe_23102024;

public class NoReturn {
    public static void main(String[] args) {
        add();
        int b = add1();
        if (b > 18) {
            System.out.println("R8 to VOTE");
        } else {
            System.out.println("NOT R8 to vote");
        }
        add2("kapil");
      float b1=  add3(8,9);
        System.out.println("SUM of two number are" +b1);
    }

    static void add() {

        System.out.println("HELLO");
    }

    static int add1() {
        System.out.println("HELLo123");
        return 19;
    }

    static void add2(String name) {
        System.out.println("My name is " + name);
    }
    static int add3(int a, int b){
        return a+b;
    }
}

