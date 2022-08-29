package Automation2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Automation 
{
	
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "c:.//Driver//chromedriver.exe");	
	WebDriver driver = new ChromeDriver();	
	driver.get("http://automationpractice.com/");
	//driver.get("http://amazon.com");
	driver.manage().window().maximize();
	driver.findElement(By.className("login")).click();
	driver.findElement(By.id("email")).sendKeys("sobhanrstech@gmail.com");
	driver.findElement(By.name("passwd")).sendKeys("sabiha2019");
	driver.findElement(By.xpath("//*[@class='icon-lock left']")).click();
	//driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS );
	//driver.findElement(By.className("icon-lock left")).click();
	
		
	}
	
	
}
