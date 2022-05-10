package Assignment01;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class bootstrapDropdown {
	WebDriver driver;
	@Test
	public void re() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SoftwareCenterApplications\\ChromeDriver 100\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/button")).click();
		List<WebElement> list = driver.findElements(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/ul"));
		System.out.println(list.size());
	
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			Thread.sleep(2000);
			if(list.get(i).getText().contentEquals("Bootstrap")) {
				list.get(i).click();
				break;
			}
			
		}
		driver.close();
	}
}
