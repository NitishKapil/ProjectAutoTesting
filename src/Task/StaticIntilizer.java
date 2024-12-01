package Task;

public class StaticIntilizer {
  int a;
    {
        System.out.println("hello" +a);
    }


    static {
        int initial = 1000;
        System.out.println("frst");
    }


    public static void main(String[] args) {
//         StaticIntilizer s = new StaticIntilizer();
       // StaticIntilizer s1 = new StaticIntilizer();

    }
}
