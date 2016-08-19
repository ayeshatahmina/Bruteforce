package pages;


	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	


	public class HomePage {

		WebDriver driver;
		By dressLink = By.xpath("//*[@id='block_top_menu']/ul/li[2]/a");
		

		By women = By.xpath(".//*[@id='block_top_menu']/ul/li[1]/a");
		By Dresses = By.xpath(".//*[@id='block_top_menu']/ul/li[2]/a");
		By Tshirt = By.xpath(".//*[@id='block_top_menu']/ul/li[3]/a");
		By Bruteforce = By.xpath(".//*[@id='block_top_menu']/ul/li[4]/a");

		
		public HomePage (WebDriver argDriver){
			driver = argDriver;
			}
		
		public void clickDress(){
			driver.findElement(dressLink).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		public String Logoheader(){
			String msg = driver.getTitle();
			return msg;
		}
		
		
		public String Womenheader (){
			String msg1 = driver.findElement(women).getText();
			return msg1;
		}
		
		public String Dressheader (){
			String msg2 = driver.findElement(Dresses).getText();
			return msg2;
		}
		public String Tshirtheader (){
			String msg3 = driver.findElement(Tshirt).getText();
			return msg3;
		}
		public String BruteForceheader (){
			String msg4 = driver.findElement(Bruteforce).getText();
			return msg4;
		}
}
