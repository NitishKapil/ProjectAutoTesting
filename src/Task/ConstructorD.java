package Task;


public class ConstructorD {
    public static void main(String[] args) {

        /*
        Car2 c3 = new Car2("Tesla", 1992);
        c3.display();

        Car2 c4 = new Car2("Nano", 1993);
        c4.display();
        */
        Car2 c1 = new Car2();



    }


}

class Car2 {
    String name;
    int year;

    Car2 ()
{
   this("kapil",9);
   System.out.println("HELLO");

}
    Car2(String cname, int yr) {
        this.name = cname;
        this.year = yr;
        System.out.println("Construcutor with nama and year");

    }

    /*void display() {
        System.out.println(this.name + "\n" + this.year);
    }
*/


}