package ActionPages;


import Base.Configpop;
import Common.CommonUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class loginActionPage {
    public loginActionPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(name="uid")
    WebElement username;
    @FindBy(name="password")
    WebElement paswrd;
    @FindBy(name="btnLogin")
    WebElement loginbtn;

    /**
     * Author: Allu ramchandra
     * Login method in to application with input parmaets set value in username and psed then click on login
     * @param uname
     * @param pswd
     */
    public void LoginApplication(String uname,String pswd) {
        //	CommonUtils.logInfo("Enter username and passowrd page");
        CommonUtil.waitForElement(10000,username);
        username.sendKeys(uname);
        paswrd.sendKeys(pswd);
        loginbtn.click();
    }


    public boolean VerifyLoginpage() {
        //CommonUtils.logInfo("Verifying Login page");
        return username.isDisplayed();
        //return false;
    }

}
