package Task;

import java.util.Scanner;
public class AverageNo {
    public static void main(String []args){
       Scanner sc = new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c =sc.nextInt();

       int average=Aver(a,b,c);
       System.out.println(average);
    }
static int Aver(int a,int b,int c){
        int avg = a+b+c/3;
        return avg;
}
}
