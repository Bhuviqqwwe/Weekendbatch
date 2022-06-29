package ScriptFor4thWeek;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActiontabEnter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sindhusri\\Desktop\\automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println(Title);
		String PopupURL = driver.getCurrentUrl();
		System.out.println(PopupURL);
		driver.findElement(By.id("email")).sendKeys("bbhuvanesh466@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("7373679397");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB,"7373679397").build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		
		

	}

}
