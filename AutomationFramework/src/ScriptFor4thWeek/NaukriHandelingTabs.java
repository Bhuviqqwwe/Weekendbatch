package ScriptFor4thWeek;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriHandelingTabs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sindhusri\\Desktop\\automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.naukri.com/");
	    driver.manage().window().maximize();
	    String Title = driver.getTitle();
		System.out.println(Title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		Thread.sleep(10000);

		driver.findElement(By.xpath("//div[text()='Register']")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("name")).sendKeys("Bhuvaneshwaran");
		driver.findElement(By.name("email")).sendKeys("bhuvi@gmail.com");
		driver.findElement(By.id("password")).sendKeys("737367");
		driver.findElement(By.id("mobile")).sendKeys("7373679397");
		Thread.sleep(10000);
		
		ArrayList <String>Naukritabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(Naukritabs.get(1));
		
		String RegisterPageURL = driver.getCurrentUrl();
		System.out.println(RegisterPageURL);
		driver.quit();

	}

}
