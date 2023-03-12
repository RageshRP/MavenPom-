package ConversePom;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import pages.loginfs;
import pages.filter;
//import pages.LeadContactHistory;
import pages.CTM;

public class ConverseStageFSBase {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException  {
		String URL = "https://converse-seo.lsq-staging.com";
		System.setProperty("WebDriver.chrome.driver","./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//creating object for login page
		
		loginfs log = new loginfs(driver);
		
		//Creating object for filters
		
		filter filt = new filter(driver);
		
		//Creating Objects for Lead Contact history
		
		//LeadContactHistory lch = new LeadContactHistory(driver);
		
		//Creating Objects for CTM
		 CTM ct = new CTM(driver);
		
		
		//Calling login page methods
		
		log.enterUserName("rageshstagea@lsqdev.in");
		log.nextButton();
		log.enterPassword("Test@321");
		log.lognxtbutton();
		
		//calling filter methods
		
//		filt.iconfilter();
//		filt.allfilter();
//		filt.iconfilter();
//		filt.unreadfilter();
		filt.iconfilter();
		filt.allfilter();
		
	
//		//Calling Lead Contact history page methods
		
//		lch.allcontclick();
		

		//Calling CTM page methods
		
		//ct.rplead();
		ct.dropdown();		

	}

}
