package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.HomePageClass;

public class PomHomepage extends HomePageClass {
	
	Actions action;
	
	
	@FindBy (id="txtUsername") WebElement Username;
	// above line will find the username line ( driver.findElement (BY.id("txtUsername").)
	
	@FindBy (id="txtPassword") WebElement Password; // password button
	
	@FindBy (id="btnLogin") WebElement Login;
	
	
	//@FindBy (id="txtPassword") WebElement Enter;
	
	@FindBy (id="menu_admin_viewAdminModule") WebElement Admin;
	
	public void getAction() {
		//@FindBy (id="mainMenu") WebElement Admin;
		Actions action= new Actions(driver);
		 
		action.moveToElement(Admin).build().perform();
		action.click();
		
		
	}
	
	
	
	
	@FindBy (id="menu_pim_viewPimModule") WebElement PIM;
	
	public PomHomepage() {
		PageFactory.initElements (driver, this);
		
	}
	
	public void typeusername(String name) {
		Username.sendKeys(name);
	}
	public void typepassword(String pass) {
		Password.sendKeys(pass);
	}
	
	public void Loginclick() {
		
		
		Login.click();
	}
	/*public void Enter() {
		
		Enter.click();
		
	}*/
	public void Adminclick() {
		Admin.click();
		
		
		
	}
   public void PIMclick() {
	  action.click(PIM);
	  
   }
}
