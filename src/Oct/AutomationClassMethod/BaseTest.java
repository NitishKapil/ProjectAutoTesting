package Oct.AutomationClassMethod;

public class BaseTest {
private String browser;
    BaseTest()    {
        System.out.println("DC_Parent");
    }

    public BaseTest(String browser) {
        this.browser = browser;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser,boolean authCode) {
        if(authCode)
        {
            this.browser = browser;
            System.out.println(browser);
        }
    else{
        System.out.println("Browser is not availabel");
        }
    }
    void openBrowser()
    {
        System.out.println("Browser is  open");
    }
 void closeBrowser()
 {
     System.out.println("Browser is close");
 }
}
