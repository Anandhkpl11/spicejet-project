package Test;

import org.testng.annotations.Test;

import Base.ProjectSpecification;
import Page.Homepage;

public class Tc_007ManageBooking extends ProjectSpecification {
	
	@Test
	public void ManageBooking() {
		
		Homepage obj=new Homepage(driver);
		lanuchbrowser("chrome");
		geturl("https://www.spicejet.com/");
		
		obj.ManageBooking().Managebookingclick().vaildatepage().closeBrowser();
				
		
	}

}
