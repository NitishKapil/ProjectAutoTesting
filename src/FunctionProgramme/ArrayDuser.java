package FunctionProgramme;

import java.util.*;

public class ArrayDuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the value of array " + " ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int len = arr.length;
        System.out.println("Element of Arrya are=");
        for (int j = 0; j < len; j++) {
            System.out.print(arr[j] + ",");
        }


    }


}

