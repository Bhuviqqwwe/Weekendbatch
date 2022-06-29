package ScriptFor4thWeek;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingTabs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sindhusri\\Desktop\\automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    String Title = driver.getTitle();
		System.out.println(Title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.findElement(By.xpath("//span[text()='Forgot?']/preceding::button[1]")).click();
		driver.findElement(By.name("q")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@name='q']/following::button")).click();
		Thread.sleep(10000);
		String MobileSearchURL = driver.getCurrentUrl();
		System.out.println(MobileSearchURL);
		
		driver.findElement(By.xpath("//div[contains(text(),'Glowing')]")).click();
		Thread.sleep(4000);
		
		ArrayList <String>flipkarttabs = new ArrayList<>(driver.getWindowHandles());
		//for(String Windowhandlesamples:flipkarttabs)
		//{
		//	System.out.println(Windowhandlesamples);
		//}
		driver.switchTo().window(flipkarttabs.get(1));
		String ProductPageURL = driver.getCurrentUrl();
		System.out.println(ProductPageURL);
		

	}

}
