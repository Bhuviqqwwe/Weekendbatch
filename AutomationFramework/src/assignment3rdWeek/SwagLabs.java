package assignment3rdWeek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sindhusri\\Desktop\\automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.saucedemo.com/");
	    driver.manage().window().maximize();
	    String Title = driver.getTitle();
		System.out.println(Title);
	    String LoginURL = driver.getCurrentUrl();
		System.out.println("Login Page URL"+ LoginURL);
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    String Tagname = driver.findElement(By.id("user-name")).getTagName();
	    System.out.println("User Name Tagname" + Tagname);
	    driver.findElement(By.name("password")).sendKeys("secret_sauce");
	    driver.findElement(By.id("login-button")).click();
	    Thread.sleep(5000);
	    
	    String ProductPageURL = driver.getCurrentUrl();
	    System.out.println("Product Page URL" + ProductPageURL);
	    driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//span[text()='Products']/preceding::a[1]")).click();
	    String AddToCartPageURL = driver.getCurrentUrl();
	    System.out.println("Add To Cart Page URL" + AddToCartPageURL);
	    driver.findElement(By.id("remove-sauce-labs-backpack")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("checkout")).click();
	    Thread.sleep(5000);
	    
	    String CheckoutInformationPage = driver.getCurrentUrl();
	    System.out.println("Check Out Information URL" + CheckoutInformationPage);
	    driver.findElement(By.id("first-name")).sendKeys("Bhuvanesh");
	    driver.findElement(By.id("last-name")).sendKeys("Waran");
	    driver.findElement(By.id("postal-code")).sendKeys("637209");
	    Thread.sleep(3000);
	    driver.findElement(By.id("continue")).click();
	    Thread.sleep(3000);
	    
	    String BillingPage = driver.getCurrentUrl();
	    System.out.println("BillingPage URL" + BillingPage);
	    driver.findElement(By.id("finish")).click();
	    
	    String LastPage = driver.getCurrentUrl();
	    System.out.println("Last Page URL" + LastPage);
	    String result1 = driver.findElement(By.xpath("//h2[contains(text(),'THANK ')]")).getText();
	    System.out.println(result1);
	    String result2 = driver.findElement(By.xpath("//div[contains(text(),'dispatched')]")).getText();
	    System.out.println(result2);
	    String ImageAttribute = driver.findElement(By.xpath("//div[contains(text(),'dispatched')]/following::img[1]")).getAttribute("src");
        System.out.println("Image Source" + ImageAttribute);
        driver.findElement(By.id("back-to-products")).click();
	}

}
