package assignment3rdWeek;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CofirmAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sindhusri\\Desktop\\automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println(Title);
		String PopupURL = driver.getCurrentUrl();
		System.out.println(PopupURL);
		driver.findElement(By.xpath("//button[contains(text(),'confirm')]/preceding::a[2]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'confirm')]")).click();
		
		Alert abc = driver.switchTo().alert();
		String PopupText = abc.getText();
		System.out.println(PopupText);
		Thread.sleep(5000);
		abc.accept();
		String result = driver.findElement(By.id("demo")).getText();
		System.out.println(result);
		
	}

}
