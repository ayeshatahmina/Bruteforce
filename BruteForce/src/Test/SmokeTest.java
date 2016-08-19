package Test;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductPages;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class SmokeTest {
	WebDriver driver;
	
	@Test
	  public void logInTest() {
	  }
 
@Test
  public void chekOutTest() {
	HomePage hp = new HomePage(driver);
	hp.clickDress();
	
	ProductPages pp = new ProductPages(driver);
	pp.addToCart();
	
	
	
	
	
  }
 
  @BeforeMethod
  public void openBrowser() {
	  System.setProperty("webdriver.chrome.driver", "C:/Users/adhora khan/Desktop/SeleniumHq/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get( "http://ebfs.bruteforcesolution.net/ebfs/index.php");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
