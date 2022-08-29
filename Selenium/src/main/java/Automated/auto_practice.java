package Automated;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto_practice 
{

   public static void main(String[] args) 
   {
    System.setProperty("webdriver.chrome.driver", "c:.//Driver//chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://automationpractice.com/");
    driver.get("http://amazon.com");   
    driver.manage().window().maximize();
    driver.close();
	   
	   
	   
   }	
	
	
	
	
	
}
