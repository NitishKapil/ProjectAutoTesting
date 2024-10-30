package Oct.exe_29102024;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayM {
    public static void main(String[] args) {
      int [] marks ={12,98,876,54,12,98};
     int maxValue= arrM(marks);
     System.out.println(maxValue);

                }
    static int arrM(int []  max)
    {
        int len = max.length;
        int maxV= max[0];
        for(int i =0;i<len;i++)
        {
        if(max[i]>maxV)
        {
           maxV = max[i];
        }
    }
    return maxV;
    }



        }




