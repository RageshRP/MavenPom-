import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test2 {

	@Test
	public void add() {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://converse.crm4b2c.com/");
		
	}

	}

