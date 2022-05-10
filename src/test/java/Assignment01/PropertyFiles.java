package Assignment01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PropertyFiles {
	WebDriver driver;



	@Test
	public void test() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SoftwareCenterApplications\\ChromeDriver 100\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Properties prop = new Properties();
	FileInputStream ip = new FileInputStream("C:\\Users\\sahil.mulla\\eclipse-workspace\\Dd\\config.properties");
	prop.load(ip);
	System.out.println(prop.getProperty("name"));
	driver.get(prop.getProperty("url"));
	Thread.sleep(2000);

	driver.close();

	}




}
