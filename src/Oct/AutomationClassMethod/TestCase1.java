package Oct.AutomationClassMethod;

public class TestCase1 extends BaseTest {

    TestCase1()
    {

        System.out.println("Child construco");
        this.start();
    }
   void start()
   {
       openBrowser();
       closeBrowser();
       this.setBrowser();
       System.out.println("Start the child");
   }
   void setBrowser()
   {
       setBrowser("chrome",false);

   }
}
