package Programme250;
import java.util.*;
public class SecondSmallest {
    public static void main(String args[])
    {
  int [] SecondLargest = {12,9,44,56,77,55};
  Arrays.sort(SecondLargest);
  int len  = SecondLargest.length-2;
  System.out.println("Second largest numvber  :" +SecondLargest[len]);
   }


}
