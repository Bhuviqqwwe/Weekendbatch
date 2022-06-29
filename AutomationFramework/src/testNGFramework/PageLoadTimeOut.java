package testNGFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PageLoadTimeOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sindhusri\\Desktop\\automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Sachin");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		//Thread.sleep(10000);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.MILLISECONDS);		
		driver.findElement(By.xpath("//h3[contains(text(),'Wikipedia')]")).click();
	}

}
