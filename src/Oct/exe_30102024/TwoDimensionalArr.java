package Oct.exe_30102024;

public class TwoDimensionalArr {
    public static void main(String args[]) {
        int[] arr = {12, 12, 13, 14};

     /*
      for (int i : arr)
      {
            System.out.println(i);
        }
*/
        int[][] arr2 = {{12}, {1, 23}, {9, 86, 56}};
        int len = arr2.length;

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }}

