package automation;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.DataProvider;

public class DataProviderTest {
	
	
	private static WebDriver driver;
	

  @DataProvider(name = "Authentication")

  public static Object[][] credentials() {

        // The number of times data is repeated, test will be executed the same no. of times

        // Here it will execute two times

        return new Object[][] { { "kaviyarasan", "Kavi@123" }, { "kaviyarasan", "Kavi@123" }};

  }

  // Here we are calling the Data Provider object with its Name

  @Test(dataProvider = "Authentication")

  public void test(String sUsername, String sPassword) {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\workspace\\geckodriver.exe");

      driver = new FirefoxDriver();

      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      driver.get("http://dixcyscott.biz");

      driver.findElement(By.id("btnSkip")).click();

      // Argument passed will be used here as String Variable

      driver.findElement(By.id("userInput")).sendKeys(sUsername);

      driver.findElement(By.id("passwordInput")).sendKeys(sPassword);

      driver.findElement(By.id("BtnLogin")).click();
     
      driver.quit();

  }

}