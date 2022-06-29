package ScriptFor4thWeek;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionUpDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sindhusri\\Desktop\\automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://the-internet.herokuapp.com/inputs");
	    driver.manage().window().maximize();
	    String Title = driver.getTitle();
		System.out.println(Title);
		String PopupURL = driver.getCurrentUrl();
		System.out.println(PopupURL);
		
		driver.findElement(By.xpath("//p[text()='Number']/following::input")).sendKeys("5");
		Thread.sleep(500);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_UP).build().perform();

	}

}
