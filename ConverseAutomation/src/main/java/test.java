import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	
	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver","./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//landing Full screen page
		driver.get("https://converse.crm4b2c.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//email id
		driver.findElement(By.xpath("//*[@id=\"EmailID\"]")).sendKeys("rageshta@lsqdev.in");
		//next button
		driver.findElement(By.xpath("//*[@id=\"login-form-container\"]/div[2]/div/div/div/div[3]/button")).click();
		//password
		driver.findElement(By.xpath(" //*[@id=\"Password\"]")).sendKeys("Lead@321");
		//sign in button
		driver.findElement(By.xpath("//button[@type='button']")).click();
		//sleep
		Thread.sleep(3000);
		//quit
		driver.quit();
		
		
		

	}

}
