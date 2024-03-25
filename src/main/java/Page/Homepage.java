package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Base.ProjectSpecification;

public class Homepage  extends ProjectSpecification{
	
	
public Homepage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	public Signuppage signup() {
		
		click("xpath", "//*[text()='Signup']");
		getwindowhandle();
		
		return new Signuppage(driver);                            
		
	}
	
	public Loginpage login() {
		
		click("xpath", "//*[text()='Login']");
		
		return new Loginpage(driver);
		
	}
	
   public Onewaytrippage oneway() {
		
		click("xpath", "//*[text()='one way']");
		
		return new Onewaytrippage(driver);
		
	}
   
    public Roundtrippage rounttrip() {
		
	   click("xpath", "//*[@data-testid='round-trip-radio-button']");
	   
	   return new Roundtrippage(driver);
   }
    
    
    public Check_inpage checkin() {
		
 	  
 	   return new Check_inpage(driver);
    }
    
    
    public Flightstatuspage Flightstatus() {
		
   	  
  	   return new Flightstatuspage(driver);
     }
    
    public ManageBookingpage ManageBooking() {
		
     	  
   	   return new ManageBookingpage(driver);
      }
    
    
    
    
    
    

}
