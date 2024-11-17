package Oct.thissuper;

public class SuperThis {
  int maxSpeed =180;

    public SuperThis() {
        System.out.println("VECHICLE" );

    }

    public SuperThis(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    void display()
     {
         System.out.println("Parent");

     }
     void display(int a)
     {
         System.out.println("HEllp");
     }
}
class car extends SuperThis
{
    int max_speed =281;

    car()
    {
        System.out.println("CAR" +"\n"+this.max_speed +"\n" +super.maxSpeed);
        super.display();


        //System.out.println(maxSpeed);
    }

    @Override
    void display() {
        System.out.println("Updated value");
    }

 static void engine()
  {
System.out.println("KAPIL");
  }
}
