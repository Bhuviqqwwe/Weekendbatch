package SEWeekend2022;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingPromptPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sindhusri\\Desktop\\automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.id("promtButton")).click();
		Alert abc = driver.switchTo().alert();
		String PopupText = abc.getText();
		System.out.println(PopupText);
		abc.sendKeys("Bhuvanesh");
		abc.accept();
		String FinalResult = driver.findElement(By.id("promptResult")).getText();
		System.out.println(FinalResult);
		//abc.dismiss();cancel

		

	}

}
