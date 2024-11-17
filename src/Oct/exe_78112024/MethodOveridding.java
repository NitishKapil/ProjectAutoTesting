package Oct.exe_78112024;

public class MethodOveridding {
 int a;
    void add()
    {
        this.a=13;
        System.out.println("Hello t all");
    }
}
class son extends MethodOveridding
{
    @Override
    void add()
    {
        this.a=14;
        System.out.println("jo joo" +a);
    }
}
