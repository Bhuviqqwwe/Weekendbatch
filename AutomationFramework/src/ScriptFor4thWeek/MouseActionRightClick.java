package ScriptFor4thWeek;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionRightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sindhusri\\Desktop\\automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	    driver.manage().window().maximize();
	    String Title = driver.getTitle();
		System.out.println(Title);
		String PopupURL = driver.getCurrentUrl();
		System.out.println(PopupURL);

		WebElement RinghtclickButton = driver.findElement(By.xpath("//span[contains(text(),'right ')]"));
		Actions act = new Actions(driver);
		act.contextClick(RinghtclickButton).build().perform();
		driver.findElement(By.xpath("//span[text()='Cut']")).click();
		Alert abc = driver.switchTo().alert();
		String PopupText = abc.getText();
		System.out.println(PopupText);
		Thread.sleep(5000);
		abc.accept();
		
			
	}

}
