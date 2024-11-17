package Task;

public class InheritClas {

    void Sound()
    {
        System.out.println("Parent class");
    }
}
class Child  extends InheritClas
{
    @Override
    void Sound()
    {
        System.out.println("child clas");
    }
}
class Bark
{
    public static void main(String[] args) {
        Child c = new Child();
        c.Sound();
    }
}
