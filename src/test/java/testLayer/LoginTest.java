package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basepackage.BaseHRMClass;
import pompackage.PomLoginpage;
import testdata.ExelSheet;

public class LoginTest extends BaseHRMClass {
    PomLoginpage log;
    
	
	public LoginTest(){
		
		super();	
	}
	
	@BeforeMethod
	public void initsetup() {
		initiation ();
	    screensshot("Login");
	    
		
		log = new PomLoginpage();
	 
		
		//PomLoginpage log = new PomLoginpage(); if you define like this its only for this method but we need to create global
		// so define at class lever and  it will work
	
	}
	
	@Test (priority=1)
	public void Title() {
		String actual = log.varify();
		
		System.out.println(actual);
		Assert.assertEquals(actual, "OrangeHRM");
		}
	
	@DataProvider
	
	public Object [][] Details(){
		Object result[][]= ExelSheet.readdata("Sheet1");
		
		return result;
		
	}
	@Test(priority=2, dataProvider = "Details")
	
	public void Login(String name, String password) {
		
		log.typeusername(name);
		log.typepassword(password);
			
		
		/*log.typeusername(prop.getProperty("username"));
		log.typepassword(prop.getProperty("password"));
		this is changed to local variable to access excel sheet
		*/
	}
	@AfterMethod
	
	public void close() {
		driver.close();
		
	}
	
}
