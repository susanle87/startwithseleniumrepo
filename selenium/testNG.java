import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testNG {
    @Test
    void setup(){
        System.out.println("i'm a tester");
    }
    @Test
    void Logtin(){
        String projectPath=System.getProperty("user.dir");
        System.setProperty("webdriver.gecko.driver", "\\D:\\automation\\geckodriver.exe");
        WebDriver driver =new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
      //  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
      //  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get("https://www.ultra88.com/");
    }
}
