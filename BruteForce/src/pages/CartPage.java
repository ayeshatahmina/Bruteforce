package pages;

//import java.util.List;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;

public class CartPage {
	WebDriver driver;

	By dress = By.xpath(".//*[@id='block_top_menu']/ul/li[2]/a");
	By product = By.xpath(".//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img");
	By addtocart = By.xpath(".//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]/span");
	By checkout = By.xpath(".//*[@id='center_column']/p[2]/a[1]/span");
	By msg1 = By.xpath(".//*[@id='cart_title']/span");
	 By Delete = By.xpath(".//*[@id='1_1_0_0']/i");


	  public void deleteitem(){
		  driver.findElement(Delete).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }

	public String readmsg() {
		String Text = driver.findElement(msg1).getText();
		return Text;
	}

	public CartPage(WebDriver argDriver) {
		driver = argDriver;
	}

	public void clickdress() {
		driver.findElement(dress).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void clickproduct() {
		driver.findElement(dress).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(product).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void clickaddtocart() {
//		driver.findElement(dress).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(product).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(addtocart).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void clickcheckout() {
//		driver.findElement(dress).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(product).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(addtocart).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(checkout).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

	}
}
