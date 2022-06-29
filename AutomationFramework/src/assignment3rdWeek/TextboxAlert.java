package assignment3rdWeek;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextboxAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sindhusri\\Desktop\\automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println(Title);
		String PopupURL = driver.getCurrentUrl();
		System.out.println(PopupURL);
		driver.findElement(By.xpath("//button[contains(text(),'prompt ')]/preceding::a[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'prompt ')]")).click();
		Alert abc = driver.switchTo().alert();
		String PopupText = abc.getText();
		System.out.println(PopupText);
		abc.sendKeys("Bhuvaneshwaran");
		abc.accept();
		String message = driver.findElement(By.id("demo1")).getText();
		System.out.println(message);

	}

}
