package Test;

import org.testng.annotations.Test;

import Base.ProjectSpecification;
import Page.Homepage;

public class Tc_001SignUp  extends ProjectSpecification{
	
	
	
	@Test
	public void Signup() throws InterruptedException  {
		Homepage obj=new Homepage(driver);
		
		lanuchbrowser("chrome");
		geturl("https://www.spicejet.com/");
		
		obj.signup().Title()
		.Firstname().lastname().country().date()
		.phonenumber().email().password().checkbox().submitbtnb();
		closeBrowser();
		
		
		
	}

}
