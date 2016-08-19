package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {
	
	WebDriver driver;
	
	By SubjectTitle = By.xpath(".//*[@id='id_contact']");
	By emailAddress = By.xpath(".//*[@id='email']");
	By msgBox = By.xpath(".//*[@id='message']");
	By SendButton = By.xpath(".//*[@id='submitMessage']");
	
	By errorMsgElement ;
	
	
	public ContactUsPage (WebDriver argDriver ){
		driver = argDriver;
	}
	
	public   void sendMessage (String argEmail , String argMsg, int argSubject ){
	driver.findElement(emailAddress).sendKeys(argEmail);
	driver.findElement(msgBox).sendKeys(argMsg);
	if (argSubject==1 || argSubject==2){
	Select subject = new Select (driver.findElement(SubjectTitle));
	subject.selectByIndex(argSubject);
	
}
	driver.findElement(SendButton).click();
	}
//	public void readErrorMsg (){
//		String msg = driver.findElement(errorMsgElement).getText();
//	}

}
