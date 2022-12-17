package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
	@FindBy(id="add")
	private WebElement plus;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addtocart;
	
	public Cart(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void addtocartbtn() {
		addtocart.click();
	}

	public WebElement getPlus() {
		return plus;
	}

}
