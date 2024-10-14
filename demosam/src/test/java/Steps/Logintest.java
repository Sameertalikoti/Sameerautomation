package Steps;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Logintest{
	
	
	WebDriver driver;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		
	    driver= new ChromeDriver();
		driver.get("https://qa-admin.1huddle.co/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		
		
	    
	}

	@When("user enters valid crdentials \\(username: {string}, password: {string})")
	public void user_enters_valid_crdentials_username_password(String username, String password) {
		
		driver.findElement(By.id("user-email")).sendKeys(username);
		driver.findElement(By.className("mat-icon")).click();
		driver.findElement(By.id("user-password")).sendKeys(password);
		
		
	    
	}

	@When("User click on the login button")
	public void user_click_on_the_login_button() {
		driver.findElement(By.xpath("/html/body/app-root/app-login/section/div[2]/div[1]/form/div[3]/button/span[1]")).click();
	    
		
	}

	@And("user should be logged in")
	public void user_should_be_logged_in() {
		boolean Status = driver.findElement(By.className("inside-title")).isDisplayed();
		Assert.assertEquals(Status, true);
	   
	}

	   
	}




