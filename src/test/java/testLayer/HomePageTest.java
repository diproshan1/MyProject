package testLayer;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.HomePageClass;
import pompackage.PomHomepage;


public class HomePageTest  extends HomePageClass{
	
	PomHomepage log;
	
	public HomePageTest () {
		super();
		
	}
	@BeforeMethod
	
	public void initsetup() {
		initiation ();
	  	
		log = new PomHomepage();
	    
		log.typeusername("Admin");
		log.typepassword("admin123");
		log.Loginclick();
		
		
		//log.Enter();
		
		
		
		//PomHomepage log = new PomHomepage(); if you define like this its only for this method but we need to create global
		// so define at class lever and  it will work
	
	}
	
	@Test
	
	public void  admintab(){
		
     
    log.Adminclick();
     
     
	
	}
	

}
