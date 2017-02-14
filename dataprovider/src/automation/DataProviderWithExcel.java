package automation;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.DataProvider;

import Utility.ExcelUtils;

public class DataProviderWithExcel {
	

WebDriver driver;

@BeforeMethod

public void beforeMethod() throws Exception {
	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\workspace\\geckodriver.exe");

    driver = new FirefoxDriver();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.get("http://dixcyscott.biz");	 

}

@Test(dataProvider="Authentication")

public void Registration_data(String sUserName,String sPassword)throws  Exception{

driver.findElement(By.id("btnSkip")).click();

driver.findElement(By.id("userInput")).sendKeys(sUserName);

System.out.println(sUserName);

driver.findElement(By.id("passwordInput")).sendKeys(sPassword);

System.out.println(sPassword);

driver.findElement(By.id("BtnLogin")).click();

System.out.println(" Login Successfully, now it is the time to Log Off buddy.");



}

@DataProvider

public Object[][] Authentication() throws Exception{

 Object[][] testObjArray = ExcelUtils.getTableArray("C:\\Users\\Admin\\workspace\\dataprovider\\bin\\Testdat\\testdata\\testdata.xls","Sheet1");

 return (testObjArray);

}

@AfterMethod

public void afterMethod() {

  driver.close();

}

}
