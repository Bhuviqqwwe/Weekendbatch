package ScriptFor4thWeek;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sindhusri\\Desktop\\automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	    driver.manage().window().maximize();
	    String Title = driver.getTitle();
		System.out.println(Title);
		String PopupURL = driver.getCurrentUrl();
		System.out.println(PopupURL);
		
		WebElement DoubleclickButton = driver.findElement(By.xpath("//button[contains(text(),'See')]"));
		Actions act = new Actions(driver);
		act.doubleClick(DoubleclickButton).build().perform();
		
		Alert abc = driver.switchTo().alert();
		String PopupText = abc.getText();
		System.out.println(PopupText);
		Thread.sleep(5000);
		abc.accept();


	}

}
