package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.PublicKey;
import java.time.Duration;

import static Base.testbase.driver;

public class CommonUtil {
public static void waitForElement(long varTime, WebElement varWE)
{
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(varTime));
    wait.until(ExpectedConditions.visibilityOf(varWE));
}
}
