package Task;

public class InheritClas {
    int a = 90;

    void Sound() {
        System.out.println("Parent class");
    }

}

class Child {
    InheritClas c;

    Child(InheritClas c) {
        this.c = c;
    }
    void display()
    {
        c.Sound();
        int b=c.a;
    }
}

class Bark {
    public static void main(String[] args) {
        InheritClas c = new InheritClas();
        Child ch = new Child(c);
        ch.display();

    }
}
