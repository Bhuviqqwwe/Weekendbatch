package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwagLabs {
	WebDriver driver;
	@Test
	public void a_pageLoad() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sindhusri\\Desktop\\automation\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://www.saucedemo.com/");
    driver.manage().window().maximize();
	}
	@Test
	public void b_loginDetails() throws InterruptedException {
    driver.findElement(By.id("user-name")).sendKeys("standard_user");
    driver.findElement(By.name("password")).sendKeys("secret_sauce");
    driver.findElement(By.id("login-button")).click();
    Thread.sleep(5000);
	}
    @Test	
    public void c_logoutDetails() throws InterruptedException {
    driver.findElement(By.id("react-burger-menu-btn")).click();
    Thread.sleep(3000);
    driver.findElement(By.id("logout_sidebar_link")).click();
	}

}
