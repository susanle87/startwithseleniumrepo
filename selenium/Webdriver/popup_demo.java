package Webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class popup_demo {

@Test
  void popup() {
        System.setProperty("webdriver.gecko.driver", "\\automation\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String appUrl = "https://accounts.google.com";
        driver.manage().window().maximize();
        driver.get(appUrl);
        System.out.println("Test script executed successfully.");
        driver.close();
        }
      @Test
        void iframdemo(){
            System.out.println("test NG demo");
        }


}
