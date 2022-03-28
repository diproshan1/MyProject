package basepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseHRMClass {

 public	static Properties prop = new Properties();
 public	static WebDriver driver;
	
	//STEP 1
	
	public BaseHRMClass() {
		
		try {
			
FileInputStream	file =new FileInputStream("C:\\Users\\Mital\\eclipse-workspace\\HRmanagement\\src\\test\\java\\environmentvariables\\Configuration.properties");		


   prop.load(file);		
	}
	catch (FileNotFoundException e){
		e.printStackTrace();
	}
	catch (IOException a) {
		a.printStackTrace();
		
	}
			
}
	//Step 2
	
	public static void initiation() {
		 /* driver path == here write path with driver you want to use
		  * perform commands on driver like maximize, page load time,implicit time, getting url etc
		  * 
		  *  to access this use if else command
		  *  if browser= chrome ---webdriver.chrome.drivers
		  *  elseif  browser = firefox =--- webdriver.gecodriver.drivers
		  * 
		  */
		
	String browsername	=prop.getProperty("browser");
		
	if (browsername.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.drivers","chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	else if (browsername.equals("Firefox")){
		
		System.setProperty("webdriver.gecko.drivers", "gecodriver.exe");
		driver = new FirefoxDriver();
			
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
	
	}
	
	
	
}