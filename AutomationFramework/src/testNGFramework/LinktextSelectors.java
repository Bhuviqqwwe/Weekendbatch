package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinktextSelectors {
	WebDriver driver;
	@Test
	public void a_pageLoad() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sindhusri\\Desktop\\automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("http://zero.webappsecurity.com/");
    driver.manage().window().maximize();
	}
	@Test
	public void b_demo() {
		driver.findElement(By.id("signin_button")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Forgot ')]"));
		driver.findElement(By.linkText("Forgot your password ?")).click();
		driver.findElement(By.partialLinkText("Forgot")).click();
	}
	}


