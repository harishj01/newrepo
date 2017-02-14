package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest1 {
	
	WebDriver driver;
@BeforeTest
 	 public void openbrowser()
 	 {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\geckodriver-v0.14.0-win32\\geckodriver.exe");
    driver = new FirefoxDriver();
 	 }
	
  @Test
  public void testjenkins() {
	  
	  
	  System.out.println("welcome to Jenkins");
	  
	  System.out.println("test");
	  System.out.println("initial commit");
  }
}
