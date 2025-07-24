package StepDef;

import ActionPages.loginActionPage;
import Base.testbase;
import io.cucumber.java.en.Given;

import java.util.concurrent.TimeUnit;

import static Base.testbase.driver;


public class loginStepDef {

    loginActionPage objloginActionPage;
    @Given("Navigate to url")
    public void navigate_to_url() {
        // Write code here that turns the phrase above into concrete actions
        testbase objbase=new testbase();
        objbase.loadconfig();
        objbase.IntialiZeBrowser("Prod");

       System.out.println("Navigated");
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\Selenium\\chromedriver.exe");

         driver.get("https://www.demo.guru99.com/V4/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        System.out.println("Navigated to URL");
        objloginActionPage=new loginActionPage(driver);
        objloginActionPage.VerifyLoginpage();
        System.out.println("Login page verified");

    }
    @Given("User enter ID and Password")
    public void user_enter_id_and_password() {
        // Write code here that turns the phrase above into concrete actions
        objloginActionPage=new loginActionPage(driver);
        objloginActionPage.LoginApplication("dfsf","sdfsdf");
        System.out.println("Navigated");
    }
    @Given("User click on login")
    public void user_click_on_login() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Navigated");
    }
    @Given("Verify index page")
    public void verify_index_page() {
        // Write code here that turns the phrase above into concrete actions

    }
}
