package automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;	
	
	
	public class javascript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\workspace\\geckodriver.exe");

	// Open Firefox browser
	FirefoxDriver driver=new FirefoxDriver();

	// Maximize the window
	driver.manage().window().maximize();

	// Open applicatiion
	driver.get("http://www.google.co.in");

	// This will execute JavaScript in your script
	((JavascriptExecutor)driver).executeScript("document.getElementById('lst-ib').value='harish';");
     driver.quit();
	}

	}

