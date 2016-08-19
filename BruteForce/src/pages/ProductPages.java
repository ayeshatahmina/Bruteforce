package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProductPages {

	WebDriver driver;

	By WomenLink = By.xpath(".//*[@id='block_top_menu']/ul/li[1]/a");

	By Popular = By.xpath(".//*[@id='home-page-tabs']/li[1]/a");

	By image = By.xpath(".//*[@id='homefeatured']/li[1]/div/div[1]/div/a[1]/img");
	By addtocart = By.xpath(".//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[1]/span");
	By more = By.xpath(".//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[2]/span");

	public ProductPages(WebDriver argDriver) {
		driver = argDriver;

	}

	public void mousehover1() {
		Actions builder = new Actions(driver);
		WebElement menuelement = driver.findElement(Popular);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		builder.moveToElement(menuelement).build().perform();
	}

	public void mousehover2() {
		Actions builder = new Actions(driver);
		WebElement menuelement = driver.findElement(image);
		builder.moveToElement(menuelement).build().perform();
	}

	public void mousehover3() {
		Actions builder = new Actions(driver);
		WebElement menuelement = driver.findElement(addtocart);
		builder.moveToElement(menuelement).build().perform();
	}

	public void mousehover4() {
		Actions builder = new Actions(driver);
		WebElement menuelement = driver.findElement(more);
		builder.moveToElement(menuelement).build().perform();
	}

	public void ClickWomen() {
		driver.findElement(WomenLink).click();

	}
	
	public void addToCart(){
		driver.findElement(addtocart).click();
		
	}
}
