package Oct.exe_17102024;

import java.util.Locale;
import java.util.Scanner;

public class BrowserSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser anme");
        String browser =sc.next();
        browser= browser.toLowerCase();
        switch(browser)
        {
            case "chrome", "opera" ->
                System.out.println("run the chrome browser");
            case "firefox","mozilaa" ->
                System.out.println("Run the Firefox");


        }
    }
}
