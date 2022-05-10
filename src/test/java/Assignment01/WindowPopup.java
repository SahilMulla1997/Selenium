package Assignment01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowPopup {
	WebDriver driver;



	@BeforeClass
	public void BeforeMethod() throws Exception {
	System.setProperty("webdriver.chrome.driver", "D:\\SoftwareCenterApplications\\ChromeDriver 100\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to("http://popuptest.com/goodpopups.html");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	}



	@Test()
	public void A3Popups() throws InterruptedException { // driver.findElement(By.xpath("//span[@class='hamburger-section'][@role='button']")).click();
	// Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='btn btn-log']")).click();
	Thread.sleep(2000);
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button['id=popup_modal_dismiss_button']")).click();
	Thread.sleep(5000);
	System.out.println(driver.getTitle()); // driver.findElement(By.xpath("//button['@id=popup_modal_dismiss_button']")).click();
	// driver.close();
	}



	@AfterClass
	public void afterClass() throws InterruptedException {
	 driver.quit();
	}
}
