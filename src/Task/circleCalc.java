package Task;

public class circleCalc {
    int radius;
    circleCalc(int r)
    {
        this.radius=r;
    }
 double getPer()
 {
     System.out.println("Perimeter value");
    return 0.0;
 }
    double getArea()
    {
        System.out.println("Area of circle");
      return 0.0;
    }
}
class circle extends circleCalc
{
    circle()
    {
        super(12);
    }
@Override
double getArea()
{
    return 3.14*radius*radius;
}
@Override
    double getPer()
{
    return 2*3.14*radius;
}
}
class Calc
{
    public static void main(String[] args) {
        circle c = new circle();
        System.out.println(c.getPer() +"\n" +c.getArea());
    }
}
