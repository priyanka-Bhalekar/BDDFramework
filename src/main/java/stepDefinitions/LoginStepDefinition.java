package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {

	WebDriver driver;
	@Given ("^user is already in login page$")
	public void user_is_already_in_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.viu.com/ott/in/en/hindi");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
	@When("^title of login page is VIU$")
	public void title_of_login_page_is_VIU()  {
    String title= driver.getTitle();
    System.out.println(title);
    Assert.assertEquals(title,"Watch Latest Hindi Movies, TV Shows, Originals Online | Viu India");
	  
	}

	@Then("^user enters user name and password$")
	public void user_enters_user_name_and_password() {
		
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
	    driver.findElement(By.xpath("//button[@class='btn-soclogin mail']")).click();
	    driver.switchTo().activeElement();
	    driver.findElement(By.xpath("//input[contains(@class,'txtemail')]")).sendKeys("priyanka1@gmail.com");
	    System.out.println("next button"+  driver.findElement(By.xpath("//input[contains(@class,'btn-soclogin')]")).isDisplayed());
	    driver.findElement(By.xpath("//input[contains(@class,'btn-soclogin')]")).click();
	    driver.findElement(By.xpath("//input[contains(@class,'txtemail pass')]")).sendKeys("1234");
	 
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()  {
		   driver.findElement(By.xpath("//input[contains(@class,'btn-soclogin')]")).click();
	  
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page()  {
		
	Boolean usericon=	driver.findElement(By.xpath("//button[contains(@class,'usersidebar')]//*[local-name()='svg']")).isDisplayed();
	Assert.assertTrue(usericon);
	}

}
