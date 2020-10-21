	package Qrious.QaTest;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
    import org.testng.annotations.AfterTest;
    import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
    import PageObjects.LandingPageObjects;
    import PageObjects.ProfilePageObjects;
    import resources.base;

	public class QaTest extends base  {
	public WebDriver driver;
	LandingPageObjects lp;
		
	@BeforeTest
	public void preRequsites() throws IOException {
	driver=initializeDriver();
	}
			
	@Test
	public void QaTest() throws InterruptedException {
		// TODO Auto-generated method stub

		driver.get(prop.getProperty("URL"));
		lp=new LandingPageObjects(driver);
		lp.Username().sendKeys(prop.getProperty("Username"));
		lp.Password().sendKeys(prop.getProperty("Password"));
		lp.Submit().click();
		String WelcomeText= lp.WelcomeText().getText().trim();
		Assert.assertEquals(WelcomeText, "Welcome to the Ubiquity Tester admin page.");
		System.out.println("Welcome Text message displayed: VERIFIED");
	    Thread.sleep(3000);
	    lp.Editprofilebtn().click();
		//driver.findElement(By.xpath("//span[contains(text(),'Edit Profile')]")).click();
		String EditPageUrl = driver.getCurrentUrl();
		Assert.assertEquals(EditPageUrl, "http://54.253.214.197:8081/editprofile");
		System.out.println("Successfully landed on edit profile page:VERIFIED");
		Thread.sleep(3000);
		ProfilePageObjects pf=new ProfilePageObjects(driver);
		pf.Email().clear();
		pf.Email().sendKeys(prop.getProperty("Email"));
		System.out.println("Email updated successfully");
		pf.Dob().clear();
		pf.Dob().sendKeys(prop.getProperty("Dob"));
		System.out.println("DOB updated successfully");
		pf.NewPassword().clear();
		pf.NewPassword().sendKeys(prop.getProperty("NewPassword"));;
		pf.ConfirmNewPassword().clear();
		pf.ConfirmNewPassword().sendKeys(prop.getProperty("ConfirmPassword"));;
		System.out.println("Password updated successfully");
		pf.SubmitBtn().click();
		String SuccessMessage=pf.SuccessMsg().getText();
		Assert.assertEquals(SuccessMessage, "Update is successful! Please see updated information below");
		System.out.println("Updated Info displayed successfully:VERIFIED");
	}
			
	@AfterTest
	public void finalStep() {
 	driver.close();
				
	}
			
}

	

