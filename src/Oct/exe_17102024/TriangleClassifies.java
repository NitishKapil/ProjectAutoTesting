package Oct.exe_17102024;
import java.util.Scanner;
public class TriangleClassifies {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Side A B C:");
        int sideA= sc.nextInt();
        int sideB = sc.nextInt();
        int sideC =sc.nextInt();
    if(sideA==sideB && sideB==sideC)
    {
        System.out.println("triangle is Equilaterals");
    }
    else if (sideA==sideB || sideB==sideC || sideA == sideC )
    {
        System.out.println("Triangle is Isoscles ");
    }
    else
    {
        System.out.println("Triangle is Scalene");
    }
    }
}
