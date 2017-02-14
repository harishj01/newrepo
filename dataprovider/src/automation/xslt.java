package automation;

	
			
	import org.openqa.selenium.By;		
	import org.openqa.selenium.WebDriver;		
	import org.openqa.selenium.firefox.FirefoxDriver;		
	import org.testng.Assert;		
	import org.testng.annotations.Test;		
	    		
	public class xslt {		
						WebDriver  driver;	

	    @Test(priority=1)			
	    public void Login() 					
	    {		
	    	System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\workspace\\geckodriver.exe");
		     driver= new FirefoxDriver();
	        //Launching the Site.		
	        driver.get("http://dixcyscott.biz");					
	                        		
	        //Login to oms	
	        driver.findElement(By.id("btnSkip")).click();
	        driver.findElement(By.id("userInput")).sendKeys("kaviyarasan");							
	        driver.findElement(By.id("passwordInput")).sendKeys("Kavi@123");							
	        driver.findElement(By.id("BtnLogin")).click();					
	        //Verifying the manager home page		
	        Assert.assertEquals(driver.getTitle(),"	DIXCY ::: Order Management System" );					
	    }		
	    		
	    @Test(priority=2)			
	    public void verifytitle()					
	    {		
	        //Verifying the title of the home page		
	        Assert.assertEquals(driver.getTitle(),"	DIXCY ::: Order Management System" );					
	        }		
	    		
	    @Test(priority=3)			
	    public void Logout()				
	    {		
	        driver.close();					
	        			
	        		
	        		
	        					
	    }		
	}	
	
  

