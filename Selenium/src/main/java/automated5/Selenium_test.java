package automated5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Selenium_test 
{
	
	public static void main(String[] args) 
	{
		
	System.setProperty("webdriver.chrome.driver", "c:.//Driver//chromedriver.exe");
	//WebDriver is interface and ChromeDriver is a class.
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    //driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	WebElement id = driver.findElement(By.xpath("//*[contains(@id='btnLogin')]"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeAsyncScript("arguments[0].style.border='5px solid red'",id);
	
		
	}
}
