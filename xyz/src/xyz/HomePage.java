package xyz;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class HomePage {

	WebDriver driver;
	
	public HomePage (WebDriver argDriver){
		driver = argDriver;
		}
	
		
By FollowUs = By.xpath(".//*[@id='social_block']/h4");
By FollowUs1 = By.xpath(".//*[@id='social_block']/ul/li[1]/a");

public void clickFollowUs(){
	driver.findElement(FollowUs).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

public void mousehover(){
	driver.findElement(FollowUs).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Actions builder=new Actions(driver);
	WebElement menuElement=driver.findElement(FollowUs1);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	builder.moveToElement(menuElement).build().perform();  
        
 

}
 
}
	

