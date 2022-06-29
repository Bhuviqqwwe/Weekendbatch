package ScriptFor4thWeek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingiFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sindhusri\\Desktop\\automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://nunzioweb.com/index.shtml");
	    driver.manage().window().maximize();
	    String Title = driver.getTitle();
		System.out.println(Title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		Thread.sleep(5000);
		
		driver.switchTo().frame("oddcouple");
		WebElement Paragraph = driver.findElement(By.xpath("//div[starts-with(text(),'A television')]"));
		System.out.println(Paragraph);
		
		
		driver.switchTo().frame("html_references");
		WebElement Para = driver.findElement(By.xpath("//div[starts-with(text(),'Hit ')]"));
		System.out.println(Para);

		
		
	}

}
