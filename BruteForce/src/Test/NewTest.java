package Test;

import org.testng.annotations.Test;

import pages.CartPage;
import pages.ContactUsPage;
import pages.HomePage;

import pages.ProductPages;
import pages.SignIn;

import org.testng.annotations.BeforeMethod;

//import java.util.List;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver ;
	String baseUrl;
	
  @Test (enabled = false)
  public void Verifywomen () {
	  HomePage hp = new  HomePage (driver);
	  String actual = hp.Womenheader();
	 Assert.assertEquals("WOMEN", actual);
  }
  
  @Test (enabled = false)
  public void VerifyDress () {
	  HomePage hp = new  HomePage (driver);
	  String actual = hp.Dressheader();
	 Assert.assertEquals("DRESSES", actual);
  }
  
  @Test (enabled = false)
  public void VerifyTshirt () {
	  HomePage hp = new  HomePage (driver);
	  String actual = hp.Tshirtheader();
	 Assert.assertEquals("T-SHIRTS", actual);
  }
  
  @Test (enabled = false)
  public void VerifyBruteForce () {
	  HomePage hp = new  HomePage (driver);
	  String actual = hp.BruteForceheader();
	 Assert.assertEquals("BRUTEFORCE",actual);
  }
  
  @Test (enabled= false)
  public void logoverified (){
	  HomePage hp = new HomePage (driver);
	 String actual = hp.Logoheader();
  Assert.assertEquals("eBFS - the power of choice", actual);
  }
  
  @Test (enabled = false)
  public void navigate (){
	  ProductPages pp = new ProductPages(driver);
	  pp.ClickWomen();
	  
  }
  @Test (enabled = false)
  public void clickpopular() {
	  ProductPages pp = new ProductPages(driver);
	  pp.mousehover1();
	  }
  @Test (enabled = false)
  public void clickimage(){
	  ProductPages pp = new ProductPages(driver);
	  pp.mousehover2();
	  
  }
  
  @Test (enabled = false)
  public void clickadd(){
	 ProductPages pp = new ProductPages(driver);
	 	pp.mousehover1();
		  pp.mousehover3();
		  
	  }
  @Test (enabled = false)
  public void clickmore(){
	 ProductPages pp = new ProductPages(driver);
	 	pp.mousehover1();
		  pp.mousehover4();
		  
	  }
  @Test (enabled = false)
	 public void clickdress (){
		 CartPage cp = new  CartPage (driver);
		 cp.clickdress();
//		 This test pass
	 }
  @Test (enabled = false)
	 public void clickproduct (){
		 CartPage cp = new  CartPage (driver);
		 cp.clickdress();
		 cp.clickproduct();
//		 This test pass
	 }
  
  @Test (enabled = false)
	 public void clickaddtocart (){
		 CartPage cp = new  CartPage (driver);
		 cp.clickdress();
		 cp.clickproduct();
		 cp.clickaddtocart();
		 
}

	 
  @Test (priority=4 )
	 public void clickcheckout (){
		 CartPage cp = new  CartPage (driver);
		 cp.clickdress();
		 cp.clickproduct();
		 cp.clickaddtocart();
		 cp.clickcheckout();
		 
		 String actual = cp.readmsg();
		 Assert.assertEquals("Your shopping cart contains: 1 product", actual);


  }		 
  
  @Test (priority=4 )
	 public void Deletemsg (){
		 CartPage cp = new  CartPage (driver);
		 cp.clickdress();
		 cp.clickproduct();
		 cp.clickaddtocart();
		 cp.clickcheckout();
		 String actual = cp.readmsg();
		 Assert.assertEquals("Your shopping cart contains: 1 product", actual);
		 cp.deleteitem();
  }
  
  
  @Test
  public void SubmitContactUsWithEmptyData(){

//	  HomePage hp = new HomePage (driver);
//	 
	  ContactUsPage cp = new ContactUsPage (driver);
cp.sendMessage ("","",0);

	  }
  @Test
  public void SubmitContactUsWithValidData() {
	  
	  ContactUsPage cp = new ContactUsPage (driver);
	  cp.sendMessage ("adhora13@gmail.com","this is a great site for shop",2);
  }
  
@Test
public void SignWithInvalidEmail() {
//  HomePage hp = new HomePage (driver);
   SignIn sp = new SignIn (driver);
  sp.signIn ("adhora13@gmail.com","456278");
  }
  
	

	  
	 	
  

  
  
		 
	 
 
  
 
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:/Users/adhora khan/Desktop/SeleniumHq/chromedriver.exe");
		  driver = new ChromeDriver();
		   driver.get( "http://ebfs.bruteforcesolution.net/ebfs/index.php");
//		   String Tittle = driver.getTitle();
//		   Assert.assertEquals("eBFS - the power of choice", Tittle);
//		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
	  }

  

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
