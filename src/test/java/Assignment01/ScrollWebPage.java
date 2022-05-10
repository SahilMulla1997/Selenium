package Assignment01;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollWebPage {
	WebDriver driver;
	@Test
	public void test01() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SoftwareCenterApplications\\ChromeDriver 100\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("http://openclinic.sourceforge.net/openclinic/home/index.php");

        Thread.sleep(2000);
        
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        Thread.sleep(2000);
        ((JavascriptExecutor)driver).executeScript("scroll(0,-100)");
  
        Thread.sleep(4000);        
        
        driver.close();
        
	}
}
