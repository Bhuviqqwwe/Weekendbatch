package testNGFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationCommand {
	WebDriver driver;
	@Test
	public void a_pageLoad() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sindhusri\\Desktop\\automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://www.saucedemo.com/");
    driver.manage().window().maximize();
    Thread.sleep(3000);
	}
	@Test
	public void Navigationcommand() throws InterruptedException {
		driver.navigate().to("https://formy-project.herokuapp.com/form");
		Thread.sleep(3000);
		driver.navigate().back();//forward & refresh
		
	}

}
