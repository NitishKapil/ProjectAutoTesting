package Generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arraylistlinkedlist {
    public static void main(String[] args) {


        Scanner sc1 = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        String str = "Y";
        while (str.equalsIgnoreCase("y")) {
            System.out.println("ENTER NAME");
            Scanner sc = new Scanner(System.in);
            String names = sc.nextLine();
            name.add(names);

            System.out.println("Enter the age");
            Integer age1 =sc.nextInt();
            age.add(age1);


            System.out.println("Enter Y to proceed and N to stop");
            str = sc1.nextLine();
         }
        System.out.println(name);
        System.out.println(age);
        sc1.close();

    }
}
