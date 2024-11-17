package Task;

public class StaticP {

    static private int Count;

    StaticP()
    {
        Count++;
        System.out.println(Count);
    }

    public static void main(String[] args) {
        StaticP s = new StaticP();
        StaticP m = new StaticP();

    }
}
