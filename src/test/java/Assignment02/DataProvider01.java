package Assignment02;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider01 {
	
	WebDriver driver;
	
		
	@DataProvider(name="getData")
	public Object[][] getData(){
	Object[][] data = new Object[2][3];
	data[0][0] = "donhere";
	data[0][1] = "don";
	data[0][2] = "Incorrect Username/Password";
	data[1][0] = "donere";
	data[1][1] = "don";
	data[1][2] = "User Id does not exist";
	return data;
	}
	@Test (dataProvider = "getData")
	public void test(String username, String password, String expectedErrorMessage) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SoftwareCenterApplications\\ChromeDriver 100\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("http://10.82.180.36/Common/Login.aspx");
	WebElement usernameTextBox = driver.findElement(By.id("body_txtUserID"));
	WebElement passwordTextBox = driver.findElement(By.id("body_txtPassword"));
	WebElement loginButton = driver.findElement(By.id("body_btnLogin"));

	usernameTextBox.sendKeys(username);
	passwordTextBox.sendKeys(password);
	loginButton.click();
	String actualErrorMessage = driver.findElement(By.id("body_lblStatus")).getText();
	Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
	Thread.sleep(5000);
	driver.close();
	}
	
	
	}
	
	
//	WebDriver driver;
//	@Test(dataProvider="sm")
//	public void f(String username, String password) throws InterruptedException {
////		System.out.println(username);
////		System.out.println(password);
//		System.setProperty("webdriver.chrome.driver", "D:\\SoftwareCenterApplications\\ChromeDriver 100\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.get("http://10.82.180.36/Common/Login.aspx");
//		Thread.sleep(2000);
//		WebElement dc = (WebElement) driver.findElements(By.xpath("//*[@id=\"body_txtUserID\"]"));
//		dc.sendKeys(username);
//		driver.close();
//	}	
//	@DataProvider(name="sm")
//	public Object[][] getData(){
//		Object[][] data = new Object[3][2];
//		
//		data[0][0] = "donhere";
//		data[0][1] = "don@123";
//
//		data[1][0] = "donhere11";
//		data[1][1] = "don@123";
//		
//		data[2][0] = "donhere22";
//		data[2][1] = "don@123";
//		
//		return data;
//	}
//	
	
//}
