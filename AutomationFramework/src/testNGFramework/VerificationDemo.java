package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerificationDemo {
	WebDriver driver;
	@Test
	public void a_pageLoad() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sindhusri\\Desktop\\automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://formy-project.herokuapp.com/form");
	driver.manage().window().maximize();
	}
	@Test
	public void b_radiobutton_verification() {
		WebElement collegeradiobutton = driver.findElement(By.id("radio-button-2"));
		collegeradiobutton.click();
		System.out.println(collegeradiobutton.isDisplayed());
		}
	@Test
	public void c_checkbox_verification() {
		WebElement checkbox = driver.findElement(By.id("checkbox-3"));
		checkbox.click();
		System.out.println(checkbox.isSelected());
		}
	@Test
	public void d_textbox_verification() {
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Form')]")).isDisplayed());
		
		}
	

}
