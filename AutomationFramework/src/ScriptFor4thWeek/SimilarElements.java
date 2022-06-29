package ScriptFor4thWeek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimilarElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sindhusri\\Desktop\\automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://en.wikipedia.org/wiki/Rajinikanth");
	    driver.manage().window().maximize();
	    String Title = driver.getTitle();
		System.out.println(Title);
		String PopupURL = driver.getCurrentUrl();
		System.out.println(PopupURL);
		//count link
		int linkscount = driver.findElements(By.tagName("a")).size();
		System.out.println(linkscount);
		
		//count image
		int imagecount = driver.findElements(By.tagName("img")).size();
		System.out.println(imagecount);
		
		//paragraph
		int paragraphcount = driver.findElements(By.tagName("p")).size();
		System.out.println(paragraphcount);
		
		
	

	}

}
