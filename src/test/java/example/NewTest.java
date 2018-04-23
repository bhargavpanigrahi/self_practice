package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
	//lauch the driver
	private WebDriver driver;		
	@Test				
	public void testEasy() {	
		driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
	}	
	@BeforeTest
	public void beforeClass() {
		   
		  System.setProperty("webdriver.ie.driver",

					"C:\\Users\\BHPANI\\Downloads\\IEDriverServer_Win32_2.48.0\\IEDriverServer.exe");
	   driver = new InternetExplorerDriver();
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}		

}
