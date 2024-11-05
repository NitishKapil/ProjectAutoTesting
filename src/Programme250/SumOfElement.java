package Programme250;

public class SumOfElement {
    public static void main(String args[]) {

        int[] sum = {12, 13, 14};
        System.out.println(sum[0]);
       int sum1=0;
        for (int i = 0; i < sum.length; i++) {
            sum1 = sum1 + sum[i];

        }
        System.out.println(sum1);
    }

}
