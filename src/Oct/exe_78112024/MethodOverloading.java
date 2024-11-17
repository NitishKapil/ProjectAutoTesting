package Oct.exe_78112024;

public class MethodOverloading {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
    void name(String name,int a)
    {

        name="kapi";
        a=12;
    }

    public static void main(String arg[]) {
        MethodOverloading obj = new MethodOverloading();
        int a = obj.add(1, 2, 9);
        System.out.println(a);
     obj.name("kapil",9);

    }
}
