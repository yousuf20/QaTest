package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LandingPageObjects {
	
public WebDriver driver;
	
	

	public LandingPageObjects(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	
	
	@FindBy(id="username")
	private WebElement Username;
	
	public WebElement Username() {
		return Username;
	}
	
	@FindBy(id="password")
	private WebElement Password;
	
	public WebElement Password() {
		return Password;
	}
	
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Submit;
	
	public WebElement Submit() {
		return Submit;
	}
	
	@FindBy(xpath="//ul[@id='fields']//h1")
	private WebElement WelcomeText;
	
	public WebElement WelcomeText() {
		return WelcomeText;
	}
	//driver.findElement(By.xpath("//span[contains(text(),'Edit Profile')]")).click();
	
	@FindBy(xpath="//span[contains(text(),'Edit Profile')]")
	private WebElement Editprofilebtn;
	
	public WebElement Editprofilebtn() {
	return Editprofilebtn;
	}
	
	

}
