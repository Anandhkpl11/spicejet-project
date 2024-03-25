package Test;

import org.testng.annotations.Test;

import Base.ProjectSpecification;
import Page.Homepage;

public class Tc_006Flightstatus extends ProjectSpecification {
			
	
	
	@Test
	public void Flightstatus() {
		
		Homepage obj=new Homepage(driver);
		lanuchbrowser("chrome");
		geturl("https://www.spicejet.com/");
		
		obj.Flightstatus().clickflightstatus().vaildatepage().closeBrowser();
		
		
	}
	
	
	
}
