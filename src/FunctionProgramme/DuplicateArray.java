package FunctionProgramme;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] marks = {12, 56, 34, 13, 13};
        int[] duplicateV = arrM(marks);
        System.out.println(duplicateV[0]);

    }

    static int[] arrM(int[] arr) {

        int len = arr.length;
        int max = arr[0];

        int[] arr1 = null;
        for (int i = 0; i < len; i++) {
            if (max == arr[i]) {
                arr1 = arr;
                System.out.println(arr1[1]);
            }

        }
        return arr1;
    }

}
