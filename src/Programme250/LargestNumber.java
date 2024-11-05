package Programme250;

public class LargestNumber {
    public static  void main(String [] args)
    {
        int [] max = {12,45,67,32,67};
         int max1= max[0];
         int len = max.length;
        System.out.println(max[0]);
         for(int i =0;i< len;i++)
         {
             if(max[0]>max[i])
             {
                  max1 = max[i];
             }

         }



    }
}
