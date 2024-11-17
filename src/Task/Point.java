package Task;

public class Point {
private double x;
private double y;

Point(int m, int n)
{
    this.x=m;
    this.y=n;
}
Point(double a, double b)
{
    this.x=a;
    this.y=b;
}
void display()
{
    System.out.println(y + "  " + x);
}
    public static void main(String[] args) {
   Point p = new Point(12,14);
   Point p1 = new Point(12.112,14.234);
   p.display();p1.display();

}
}
