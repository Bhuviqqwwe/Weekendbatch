package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectors {
	WebDriver driver;
	@Test
	public void a_pageLoad() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sindhusri\\Desktop\\automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://www.saucedemo.com/");
    driver.manage().window().maximize();
	}
	@Test
	public void b_login() {
	driver.findElement(By.id("user-name")).sendKeys("bhuvanesh");
	driver.findElement(By.cssSelector("#user-name")).sendKeys("bhuvanesh");
	}

	}


