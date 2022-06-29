package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Formy {
		WebDriver driver;
		@Test
		public void a_pageLoad() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sindhusri\\Desktop\\automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
		}
		@Test
		public void b_logindetails() {
		driver.findElement(By.id("first-name")).sendKeys("Bhuvanesh");
		driver.findElement(By.id("last-name")).sendKeys("Waran");
		driver.findElement(By.id("job-title")).sendKeys("Automation Testing");
		//driver.findElement(By.id("radio-button-2")).click();
		WebElement Radiobutton = driver.findElement(By.id("radio-button-2"));
		Radiobutton.click();
		//driver.findElement(By.id("checkbox-1")).click();
		WebElement Checkbox = driver.findElement(By.id("checkbox-1"));
		Checkbox.click();
		Select experience = new Select(driver.findElement(By.id("select-menu")));
		experience.selectByVisibleText("2-4");
		driver.findElement(By.id("datepicker")).sendKeys("01/01/1997");
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
	}

}
