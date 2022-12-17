package scripts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition {
	public WebDriver driver;
	
	@Given("open the browser enter the url")
	public void open_the_browser_enter_the_url() {
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.actitime.com/login.do");
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	}

	@When("enter valid username and valid password")
	public void enter_valid_username_and_valid_password() {
	  driver.findElement(By.id("username")).sendKeys("admin"); 
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	}

	@When("click on login button")
	public void click_on_login_button() throws InterruptedException {
	  driver.findElement(By.xpath("//div[text()='Login ']")).click(); 
	Thread.sleep(5000);
	}

	@Then("home page should be dispalyed")
	public void home_page_should_be_dispalyed() {
	  String title = driver.getTitle();  
	  if(title.equals("actiTIME -  Enter Time-Track")) {
		  System.out.println("pass");
	  }
	  else
	  {
		  System.out.println("Fail");
	  }
	}
}
