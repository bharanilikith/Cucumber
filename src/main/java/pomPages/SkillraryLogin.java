package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLogin {
	public WebDriver driver;
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearstab;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	public SkillraryLogin(WebDriver driver) {
PageFactory.initElements(driver,this);
this.driver=driver;
	}
	
	public void skillrarydemo() {
		gearstab.click();
		skillrarydemoapp.click();
	}

}
