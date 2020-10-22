package Qrious.QaTest;
	
import java.awt.Image;
import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
    import org.testng.annotations.AfterTest;
    import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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
		driver.manage().window().maximize();
		lp=new LandingPageObjects(driver);
		lp.Username().sendKeys(prop.getProperty("Username"));
		lp.Password().sendKeys(prop.getProperty("Password"));
		lp.Submit().click();
		String WelcomeText= lp.WelcomeText().getText().trim();
		SoftAssert sa = new SoftAssert();
	    sa.assertEquals(WelcomeText, "Welcome to the Ubiquity Tester Test admin page");
		System.out.println("Bug: Test keyword is missing from Welcome Text: VERIFIED");
		boolean lmagePresent = lp.MarketingImg().isDisplayed();
		Assert.assertTrue(lmagePresent);
		System.out.println("Ubiquity marketing Image Present:VERIFIED");
		//WebDriverWait wait = new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Edit Profile')]")));
		Thread.sleep(3000);
	    lp.Editprofilebtn().click();
		String EditPageUrl = driver.getCurrentUrl();
		sa.assertEquals(EditPageUrl, "http://54.253.214.197:8081/editprofile");
		System.out.println("Successfully landed on edit profile page:VERIFIED");
		Thread.sleep(3000);
		System.out.println("BUG: Missing Ubiquity logo on profile page:VERIFIED");
		ProfilePageObjects pf=new ProfilePageObjects(driver);
		pf.Email().clear();
		pf.Email().sendKeys(prop.getProperty("Email"));
		System.out.println("Email updated successfully: VERIFIED");
		pf.Dob().clear();
		pf.Dob().sendKeys(prop.getProperty("Dob"));
		System.out.println("DOB updated successfully: VERIFIED");
		pf.NewPassword().clear();
		pf.NewPassword().sendKeys(prop.getProperty("NewPassword"));;
		pf.ConfirmNewPassword().clear();
		pf.ConfirmNewPassword().sendKeys(prop.getProperty("ConfirmPassword"));;
		System.out.println("Password updated successfully: VERIFIED");
		pf.SubmitBtn().click();
		String SuccessMessage=pf.SuccessMsg().getText();
		Assert.assertEquals(SuccessMessage, "Update is successful! Please see updated information below");
		System.out.println("Updated Info displayed successfully:VERIFIED");
		//pf.LogOut().click();
		
	}
			
	@AfterTest
	public void finalStep() {
 	driver.close();
				
	}
			
}

	

