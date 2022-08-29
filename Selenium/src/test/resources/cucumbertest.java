import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cucumber 
{
	WebDriver driver;
	@Given("^User able to open any browser$")
	public void user_able_to_open_any_browser() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver", "c:.//Driver//chromedriver.exe");
		 driver = new ChromeDriver();  
	}

	@Given("^User able to enter the URL$")
	public void user_able_to_enter_the_URL() throws Throwable {
		driver.get("http://automationpractice.com/");  
	   
	}

	@When("^User able click on Signin Button$")
	public void user_able_click_on_Signin_Button() throws Throwable {
	   
	   
	}

	@When("^User able to enter the Username$")
	public void user_able_to_enter_the_Username() throws Throwable {
	   
	   
	}

	@When("^User able to enter the Password$")
	public void user_able_to_enter_the_Password() throws Throwable {
	   
	   
	}

	@When("^User able to click on the submit Button$")
	public void user_able_to_click_on_the_submit_Button() throws Throwable {
	   
	   
	}

	@Then("^User able to login Successfully$")
	public void user_able_to_login_Successfully() throws Throwable {
	   
	   
	}

	@Then("^User able see his/her Name in the home page$")
	public void user_able_see_his_her_Name_in_the_home_page() throws Throwable {
	   
	   
	}


}
