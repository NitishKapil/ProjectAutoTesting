package Programme250;

public class ReverseOfArray {
    public static void main(String args[])
    {
        int [] arr ={1,2,3,4,5};
        int len = arr.length;

        for(int j=len-1;j>=0;j--)
        {
            System.out.print(arr[j]);
        }


    }
}
