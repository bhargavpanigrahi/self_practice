package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testing {
	
	//checking for self purpose
	//it should update this
	
	public WebDriver driver;
	 @Test
	  public void openMyBlog() {
	 driver.get("https://www.softwaretestingmaterial.com/");
	  }
	  
	  @BeforeClass
	  public void beforeClass() {
	   
		  System.setProperty("webdriver.ie.driver",

					"C:\\Users\\BHPANI\\Downloads\\IEDriverServer_Win32_2.48.0\\IEDriverServer.exe");
	   driver = new InternetExplorerDriver();
	   
	  }
	 
	  @AfterClass
	  public void afterClass() {
		  System.out.println("kill the browser");
	   driver.quit();
	  }

}
