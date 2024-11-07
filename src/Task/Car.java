package Task;

public class Car {
        String name;
        int year;
        String Model;

Car()
{

    this.year=1991;
    this.Model="Dream";
}

void display()
{
    System.out.println(this.year +"\n" + this.Model);
}

Car(String name)
{
    this.name=name;

}
Car(String name1, int year)
{
    this.Model=name1;
    this.year=year;
    System.out.println(this.Model + "\n" + this.year);
}
void display1()
{
    System.out.println(this.name);

}

}
