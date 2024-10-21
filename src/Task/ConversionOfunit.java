package Task;

import java.util.Scanner;

public class ConversionOfunit {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the value from 1->Km to Miles 2>MilestoKm 3->C to F 4->F to C" );
     int numCon = sc.nextInt();

     switch(numCon)
     {
         case 1 :
             System.out.println("Enter the Miles");
             int a=sc.nextInt();
             float result = (float)a *1.60934f;
             System.out.println(result);
             break;
            // System.out.println();

         }



    }
}
