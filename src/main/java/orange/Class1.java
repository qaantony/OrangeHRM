package orange;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class1 {
@Test
	public  void haha() {
	
	System.out.println("Antony");
		System.setProperty("webdriver.gecko.driver", "D:\\tet\\Selenium_Demp\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.quit();
		
		System.setProperty("webdriver.gecko.driver", "D:\\tet\\Selenium_Demp\\geckodriver.exe");
		WebDriver driver2=new FirefoxDriver();
		driver2.get("http://newtours.demoaut.com");
		driver2.quit();

	}

}
