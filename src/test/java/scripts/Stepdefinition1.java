package scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Ecommerce.Firelawn.genericLIb.BaseClass;
import com.Ecommerce.Firelawn.genericLIb.WebdriverUtilies;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pomPages.Cart;
import pomPages.SkillraryDemo;
import pomPages.SkillraryLogin;

public class Stepdefinition1 extends BaseClass {
	public WebDriver driver;
	@Given("open the browser")
	public void open_the_browser() throws IOException {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(fu.getPropertydata("url"));
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@When("click on gears and click on demoappskillrary")
	public void click_on_gears_and_click_on_demoappskillrary() {
	   SkillraryLogin l=new SkillraryLogin(driver);
	   l.skillrarydemo();
	   webutilies.switchtabs(driver);
	}

	@When("mouse hover on course and click on seleniumtraining")
	public void mouse_hover_on_course_and_click_on_seleniumtraining() {
	   SkillraryDemo d=new SkillraryDemo(driver);
	   webutilies.mouseHover(driver,d.getCoursetab());
	   d.seleniumtartiningtab();
	}

	@When("double click on plus icon and click on addtocart")
	public void double_click_on_plus_icon_and_click_on_addtocart() {
	   Cart c=new Cart(driver);
	   webutilies.doubleClick(driver,c.getPlus());
	   c.addtocartbtn();
	}

	@Then("product should be successfully added to cart")
	public void product_should_be_successfully_added_to_cart() {
	   webutilies.alertpopupwithaccept(driver);
	}
}
