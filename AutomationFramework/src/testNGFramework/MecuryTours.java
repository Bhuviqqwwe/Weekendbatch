package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MecuryTours {
	    WebDriver driver;
	    @Test
	    public void a_pageLoad() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\sindhusri\\Desktop\\automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
	    }
	    @Test
	    public void b_personDetails() {
        driver.findElement(By.name("firstName")).sendKeys("Bhuvanesh");
        driver.findElement(By.name("lastName")).sendKeys("Waran");
        driver.findElement(By.name("phone")).sendKeys("7373679397");
        driver.findElement(By.id("userName")).sendKeys("bbhuvanesh466@gmail.com");
        driver.findElement(By.name("address1")).sendKeys("4/74 rajaji street");
        driver.findElement(By.name("city")).sendKeys("chennai");
        driver.findElement(By.name("state")).sendKeys("Tamilnadu");
        driver.findElement(By.name("postalCode")).sendKeys("600027");
        driver.findElement(By.id("email")).sendKeys("bbhuvanesh466@gmail.com");
        driver.findElement(By.name("password")).sendKeys("bhuvi7373");
        driver.findElement(By.name("confirmPassword")).sendKeys("bhuvi7373");
        driver.findElement(By.name("submit")).click();
        
        
	}

}
