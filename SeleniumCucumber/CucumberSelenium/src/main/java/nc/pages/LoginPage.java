package nc.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nc.SanveoBase;

public class LoginPage extends SanveoBase{

	@FindBy(id="ap_email")
	WebElement username;

	@FindBy(id = "continue")
	WebElement continueButton;

	@FindBy(id = "ap_password")
	WebElement password;

	@FindBy(id = "signInSubmit")
	WebElement SignIn;

	@FindBy(id = "nav-link-accountList")
	WebElement loginButton;

	@FindBy(xpath = "//div[@id= 'auth-error-message-box']")
	WebElement emailAlert;

	@FindBy(xpath = "//div[@id= 'auth-error-message-box']")
	WebElement passwordAlert;

	@FindBy(xpath = "//label[@for = 'ap_email']")
	WebElement emailLabel;

	@FindBy(xpath = "//span[text() = 'Sign Out']")
	WebElement signOut;

	Boolean	usernameFail = false;
	Boolean passwordFail = false;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
		
		public HomePage LoginPage(String un, String pass) {

			driver.findElement(By.id("nav-link-accountList")).click();
			driver.findElement(By.id("ap_email")).sendKeys(un);
			driver.findElement(By.id("continue")).click();
			try{
				usernameFail = driver.findElement(By.xpath("//div[@id= 'auth-error-message-box']")).isDisplayed();
			}
			catch(Exception e){
				System.out.println(usernameFail);
				if(usernameFail){
					Assert.fail(driver.findElement(By.xpath("//div[@id= 'auth-error-message-box']")).getText());
				}
			}
			driver.findElement(By.id("ap_password")).sendKeys(pass);
			driver.findElement(By.id("signInSubmit")).click();
			try {
				passwordFail = driver.findElement(By.xpath("//div[@id= 'auth-error-message-box']")).isDisplayed();
			}
			catch (Exception e){
			}
			if(passwordFail){
				Assert.fail(driver.findElement(By.xpath("//div[@id= 'auth-error-message-box']")).getText());
			}
			return new HomePage();
		}
}