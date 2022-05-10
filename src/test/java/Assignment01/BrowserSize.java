package Assignment01;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserSize {
	WebDriver driver;
	@Test
	public void test01() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SoftwareCenterApplications\\ChromeDriver 100\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        Dimension d = new Dimension(500, 900);
        
        driver.manage().window().setSize(d);
        
        Thread.sleep(5000);
        
        driver.close();
        
	}
}
