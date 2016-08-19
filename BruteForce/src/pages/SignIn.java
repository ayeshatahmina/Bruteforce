package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {

	WebDriver driver;
	
	By emailAddress = By.xpath(".//*[@id='email']");
	By passwordBox = By.xpath(".//*[@id='passwd']");
	By signInButton = By.xpath(".//*[@id='SubmitLogin']");

	
	public SignIn (WebDriver argDriver ){
		driver = argDriver ;
		
	}
	
	public void signIn(String email , String password){
		driver.findElement(emailAddress).sendKeys(email);
		driver.findElement(passwordBox).sendKeys(password);
		driver.findElement(signInButton).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
}	

