package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class filter {
	
	WebDriver driver;
	
	public filter(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//locator for icon
	
	By icon = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/img[1]");
	
	
    //locator for all filter
	
	By all = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/ul[1]/li[1]");
	
	//locator for unread filter
	
	By unread = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/ul[1]/li[2]");
	
	
   public void iconfilter()  {
	   driver.findElement(icon).click();
	  
   }
   
   public void allfilter() {
	   driver.findElement(all).click();
	   
   }
   
   public void unreadfilter() {
	   driver.findElement(unread).click();
	   System.out.println("Success Filters");
	   
   }
   
}
