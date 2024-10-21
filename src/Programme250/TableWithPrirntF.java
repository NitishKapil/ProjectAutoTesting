package Programme250;

import java.util.Scanner;

public class TableWithPrirntF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number want a table");
        int table = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(table + "*" + i + "=" + table * i);
            sc.close();

        }
    }
}
