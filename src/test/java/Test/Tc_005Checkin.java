package Test;

import org.testng.annotations.Test;

import Base.ProjectSpecification;
import Page.Homepage;

public class Tc_005Checkin  extends ProjectSpecification{
	
	@Test
	public void checkin() {
		
		Homepage obj=new Homepage(driver);
		lanuchbrowser("chrome");
		geturl("https://www.spicejet.com/");
		
		obj.checkin().check().vaildatepage().closeBrowser();
	
		
	}

}
