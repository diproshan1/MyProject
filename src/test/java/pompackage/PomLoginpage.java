package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BaseHRMClass;

public class PomLoginpage extends BaseHRMClass {

	//object reposerty
	
	@FindBy (id="txtUsername") WebElement Username;
	// above line will find the username line ( driver.findElement (BY.id("txtUsername").)
	
	@FindBy (id="txtPassword") WebElement Password; // password button
	
	@FindBy (id="btnLogin") WebElement Loginbtn; // Login Page
	
	@FindBy (id="forgotPasswordLink") WebElement Forgotpassword;
	
	// initiate	page Element
	// To excess above element we need to create constructor  and make this call to child class of BaseHRMClass to we can 
	// excess its methods 
	
	public PomLoginpage() {
		
		PageFactory.initElements (driver, this);
		
	}
	
	public void typeusername(String name) {
		Username.sendKeys(name);
	}
	public void typepassword(String pass) {
		Password.sendKeys(pass);
	}
	public void loginbutton(){
		Loginbtn.click();
	}
    public void forgotpass() {
    	Forgotpassword.click();
    }
	public String varify() {
		return driver.getTitle();
		
		
	}
	
}
