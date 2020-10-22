package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 public class ProfilePageObjects {
	private WebDriver driver;

	public ProfilePageObjects(WebDriver driver){
	    this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//li[@id='Email']//div[@class='field-value']//input[@type='text']")
	private WebElement Email;

	public WebElement Email() {
	return Email;
	}
	
	@FindBy(xpath="//li[@id='DateOfBirth']//div[@class='field-value']//input[@type='text']")
	private WebElement Dob;

	public WebElement Dob() {
	return Dob;
	}
	
	@FindBy(xpath="//li[@id='NewPassword']//div[@class='field-value']//input[@type='Password']")
	private WebElement NewPassword;

	public WebElement NewPassword() {
	return NewPassword;
	}
	
	@FindBy(xpath="//li[@id='ConfirmNewPassword']//div[@class='field-value']//input[@type='Password']")
	private WebElement ConfirmNewPassword;

	public WebElement ConfirmNewPassword() {
	return ConfirmNewPassword;
	}
	
	@FindBy(xpath="//button[@class='submit-button engage-button submit right']")
	private WebElement SubmitBtn;

	public WebElement SubmitBtn() {
	return SubmitBtn;
	}
	@FindBy(xpath="//p[@id='SuccessMessage']")
	private WebElement SuccessMsg;

	public WebElement SuccessMsg() {
	return SuccessMsg;
	}
	
	@FindBy(linkText="Logout")
	private WebElement LogOut;

	public WebElement LogOut() {
	return LogOut;
	}
	
	
}
