package AutomationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebsiteSmokeTest {
	
	public static WebDriver driver = new FirefoxDriver ();
	
	public static void main(String[] args) {
		
	
		
		
		driver.navigate().to("http://ebfs.bruteforcesolution.net/ebfs/index.php");
		//object for this page
		HomePage page = new HomePage(driver);
		
		//		serach for text
		page.textSearch.sendKeys("Dress");
		//		click the button
		page.Search.click();
	}

}
