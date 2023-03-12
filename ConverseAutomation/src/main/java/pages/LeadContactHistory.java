package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LeadContactHistory {
	
WebDriver driver;
	
	public LeadContactHistory(WebDriver driver) {
		this.driver = driver;
	}
	
	//Locator for chat list 
	
	By Contacts = By.xpath("//div[@class='ReactVirtualized__Grid__innerScrollContainer']");
	
	//Creating Method for click every lead contact in chat list and get the lead name and last message
	
	public void allcontclick() {
		List<WebElement> options = driver.findElements(Contacts);
		
		WebElement opt;
		
		for(int i=0;i<options.size();i++) {
			opt = options.get(i);
			opt.click();
			System.out.println(opt.getText());
		}
	}

}


////div[@class='ReactVirtualized__Grid__innerScrollContainer']//span[@class = 'cv-recent-contact-name' and @title='+62-87883801916']
