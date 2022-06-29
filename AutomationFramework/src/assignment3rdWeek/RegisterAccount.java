package assignment3rdWeek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterAccount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sindhusri\\Desktop\\automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.opencart.com/index.php?route=account/register");
	    driver.manage().window().maximize();
	    String Title = driver.getTitle();
		System.out.println(Title);
	    String LoginURL = driver.getCurrentUrl();
		System.out.println("Login Page URL=" + LoginURL);
	    driver.findElement(By.id("input-firstname")).sendKeys("Bhuvanesh");
	    driver.findElement(By.id("input-lastname")).sendKeys("Venga");
	    driver.findElement(By.id("input-email")).sendKeys("bbhuvanesh23@gmail.com");
	    driver.findElement(By.id("input-telephone")).sendKeys("9876593210");
	    driver.findElement(By.id("input-password")).sendKeys("bhuvi907");
	    driver.findElement(By.id("input-confirm")).sendKeys("bhuvi907");
	    Thread.sleep(8000);
	    WebElement yes = driver.findElement(By.name("newsletter"));
	    yes.click();
	    //WebElement no = driver.findElement(By.name("newsletter"));
	    //no.click();
	    
	    WebElement agree = driver.findElement(By.name("agree"));
	    agree.click();
	    WebElement submit = driver.findElement(By.xpath("//input[@name='agree']/following::input[1]"));
	    submit.click();
	    
	    String CreatedPageURL = driver.getCurrentUrl();
		System.out.println("Account Created =" + CreatedPageURL);
		String accountcreated = driver.findElement(By.xpath("//h1[contains(text(),'Created')]")).getText();
		System.out.println(accountcreated);
		String Tagname = driver.findElement(By.xpath("//h1[contains(text(),'Created')]")).getTagName();
		System.out.println(Tagname);
		String cssvalue = driver.findElement(By.xpath("//h1[contains(text(),'Created')]")).getCssValue("font-weight");
		System.out.println("cssvalue=" +cssvalue);
		
	    
	    
	    
	    

	}

}
