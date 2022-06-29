package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AssignmentPetstoreRegister2 {
	WebDriver driver;
	@Test
	public void a_pageLoad() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sindhusri\\Desktop\\automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://petstore.octoperf.com/actions/Account.action;jsessionid=E52C5C0AA486DE89C8AE49BE0D666188?newAccountForm=");
	    driver.manage().window().maximize();
	}
	@Test
	public void b_userInfo() {
		//User Information
		driver.findElement(By.name("username")).sendKeys("15BCE2009");
		driver.findElement(By.name("password")).sendKeys("bhuvanesh03");
		driver.findElement(By.name("repeatedPassword")).sendKeys("bhuvanesh03");
	}
	@Test
	public void c_accountInfo(){
		//Account Information
		driver.findElement(By.name("account.firstName")).sendKeys("Bhuvanesh");
		driver.findElement(By.name("account.lastName")).sendKeys("Waran");
		driver.findElement(By.name("account.email")).sendKeys("bhuvanesh12345@gmail.com");
		driver.findElement(By.name("account.phone")).sendKeys("7373679397");
		driver.findElement(By.name("account.address1")).sendKeys("4/74 Gandhi street,chrompet,chennai");
		driver.findElement(By.name("account.address2")).sendKeys("4/74 Gandhi street,chrompet,chennai");
		driver.findElement(By.name("account.city")).sendKeys("Chennai");
		driver.findElement(By.name("account.state")).sendKeys("Tamilnadu");
		driver.findElement(By.name("account.zip")).sendKeys("600003");
		driver.findElement(By.name("account.country")).sendKeys("India");
	}
	@Test
	public void d_profileInfo() throws InterruptedException {
		//Profile Information
		Select Language = new Select(driver.findElement(By.name("account.languagePreference")));
		Language.selectByVisibleText("japanese");
		Select Favourite = new Select(driver.findElement(By.name("account.favouriteCategoryId")));
		Favourite.selectByVisibleText("DOGS");
		driver.findElement(By.name("account.listOption")).click();
		driver.findElement(By.name("account.bannerOption")).click();
		Thread.sleep(7000);
		driver.findElement(By.name("newAccount")).click();

		
	}

}
