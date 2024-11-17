package Task;

public class BaseTest {
    public BaseTest() {
        System.out.println("FATHER CLASS");
    }
    void startBrowser()
    {
        System.out.println("Start Browser");
    }
    void closeBrowser(){
        System.out.println("END of the bowser");
    }}
    class TestCase extends BaseTest
    {
        public TestCase() {
            System.out.println("CHILD class");

        }
    }
  class MainC extends BaseTest
  {
      public static void main(String args[])
      {
    TestCase t1 = new TestCase();

      }
  }




  



