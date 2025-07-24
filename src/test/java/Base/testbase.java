package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.time.Duration;

public class testbase {
    public static WebDriver driver;
    public void IntialiZeBrowser(String env) {
        if (env.equalsIgnoreCase("prod")) {
            System.out.println("this is a prod env ");
        }
        if (Configpop.getBrowser().equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selenium\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(Configpop.getUrl());
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        } else if (Configpop.getBrowser().equalsIgnoreCase("Edge")) {
            // Edge browser setup
        }
    }

    public void loadconfig() {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(new File("C:\\Users\\RavindraB\\FebProjectBDD\\src\\test\\resources\\Application.properties")));
            Configpop.setUrl(prop.getProperty("url"));
            Configpop.setBrowser(prop.getProperty("browser"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static void main(String[] args) {
        testbase obj = new testbase();
        obj.loadconfig();
        obj.IntialiZeBrowser("prod");
        closeBrowser();
    }
}