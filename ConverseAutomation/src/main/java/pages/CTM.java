package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CTM {
	
	WebDriver driver;
	
	public CTM(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//Lead Selection (If lead name needed to be changed remove previous lead name in single quote add new)
	
	
	
	//Message Box Dropdown button locator
	//Connector dropdown locator
	//select ctm connector locator
	//Message box click and send messages .smileys . file upload locators
	
	By les = By.xpath("div[@class='ReactVirtualized__Grid__innerScrollContainer'] //span[@class = 'cv-recent-contact-name' and @title='+62-87883801916']");
	//public void rplead() throws InterruptedException  {
//		List<WebElement> leadlists = driver.findElements(By.xpath("div[@class='ReactVirtualized__Grid__innerScrollContainer']//span[@class = 'cv-recent-contact-name' and @title='+62-87883801916']"));
//	    
//	    
//	    for(WebElement lead:leadlists) {
//	    	String leadName=lead.getText();
//	    	System.out.println(leadName);
//	    	System.out.println("Run");
//	    	if(leadName.equalsIgnoreCase("Ragesh StageA")) {
//	    		Thread.sleep(2000);
//	    		lead.click();
//	    		break;
//	    	}
//	    	
//	    }
//	
//	}
	
	public void dropdown() {
		driver.findElement(By.xpath("div[@class='ReactVirtualized__Grid__innerScrollContainer']//span[@class = 'cv-recent-contact-name' and @title='+91-7046347005']")).click();
	}
		
	}
//	
//	public void connectorselect() {
//		
//	}
//	
//	public void messagesend() {
//		
//	}


