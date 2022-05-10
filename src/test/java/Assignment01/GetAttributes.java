package Assignment01;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetAttributes {
	@Test
	public void sd() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SoftwareCenterApplications\\ChromeDriver 100\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		JavascriptExecutor j = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		j.executeScript("document.getElementById('txtUsername').value='Selenium'");
		j.executeScript("document.getElementById('txtPassword').value='S'");
		Thread.sleep(2000);
		driver.close();
	}
}
