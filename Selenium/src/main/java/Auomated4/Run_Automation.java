package Auomated4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_Automation 
{
    public static void main(String[] args) 
    {
     System.setProperty("webdriver.chrome.driver", "c:.//Driver//chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 driver.get("http://automationpractice.com/");
	 //driver.get("http://amazon.com");
	 driver.manage().window().maximize();
	 driver.findElement(By.className("login")).click();
	 driver.findElement(By.id("email")).sendKeys("driver");
	 driver.findElement(By.id("passwd")).sendKeys("sabiha2019");
	 driver.findElement(By.xpath("//*[@class='icon-lock left']")).click();
	 driver.findElement(By.xpath("(//*[@class='sf-with-ul'])[4]")).click();
	 driver.findElement(By.xpath("(//*[@class='sf-with-ul'])[1]")).click();
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	 js.executeAsyncScript("window.scrollBy(0,1000)");
	 
	 
	 
    }	
	
}
