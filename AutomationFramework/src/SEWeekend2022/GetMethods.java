package SEWeekend2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sindhusri\\Desktop\\automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		//System.out.println(driver.getTitle());[CHECK PAGE TITLE]
		String PageTitle = driver.getTitle();
		System.out.println(PageTitle);
		driver.findElement(By.id("signin_button")).click();
		String LoginURL = driver.getCurrentUrl();
		System.out.println(LoginURL);
		//System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Log ')]")).getText());
		String LoginText = driver.findElement(By.xpath("//h3[contains(text(),'Log ')]")).getText();
		System.out.println(LoginText);
		String ForgotLink = driver.findElement(By.xpath("//a[contains(text(),'Forgot ')]")).getText();
		System.out.println(ForgotLink);
		String SingInButton = driver.findElement(By.name("submit")).getTagName();
		System.out.println(SingInButton);
		String AttributeValue = driver.findElement(By.name("submit")).getAttribute("tabindex");
		System.out.println(AttributeValue);
		String CssValue = driver.findElement(By.name("submit")).getCssValue("font-size");
		System.out.println(CssValue);

		
	}

}
