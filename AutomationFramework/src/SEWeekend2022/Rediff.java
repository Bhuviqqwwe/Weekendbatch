package SEWeekend2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sindhusri\\Desktop\\automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		//driver.findElement(By.name("namecd2b806d")).sendKeys("Bhuvanesh");
		driver.findElement(By.xpath("//td[text()='Full Name']/following::input[1]")).sendKeys("Bhuvaneshwaran");
		driver.findElement(By.xpath("//td[text()='Choose a Rediffmail ID']/following::input[1]")).sendKeys("bhuvi73");
		driver.findElement(By.xpath("//td[contains(text(),'Retype password')]/preceding::input[1]")).sendKeys("@bhuvi7373");
		

	}

}
