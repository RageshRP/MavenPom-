package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginfs {
	
	WebDriver driver;
	
	public loginfs(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	//locator for username 
	
	By User = By.id("EmailID");
	
	// locator for next button
	 
	By nxtbutton = By.tagName("button");
	
	// locator for password
	
	By pass = By.id("Password");
	
	// locator to click login button
	
	By log = By.tagName("button");
	

	//Method to enter username
	
	public void enterUserName(String userid) {
		driver.findElement(User).sendKeys(userid);
		
	}
	
	//Method Next button click
	
	public void nextButton() {
		driver.findElement(nxtbutton).click();
	}
	
	//Method to enter password
	
	public void enterPassword(String passid) {
		driver.findElement(pass).sendKeys(passid);
	}
	
	//Method Next button click
	
	public void lognxtbutton() {
		driver.findElement(nxtbutton).click();
	}
	
	
	


}
