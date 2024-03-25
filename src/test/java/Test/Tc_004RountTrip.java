package Test;

import org.testng.annotations.Test;

import Base.ProjectSpecification;
import Page.Homepage;

public class Tc_004RountTrip extends ProjectSpecification {
	
	@Test
	public void Roundtrip() throws InterruptedException {
		
		Homepage obj=new Homepage(driver);
		
		lanuchbrowser("chrome");
		geturl("https://www.spicejet.com/");
		
		obj.rounttrip().from().To().date().passenger().searchbtn()
		.continuebtn1().contactdetail().firstnameandlastname().phonenumberandEmailandcountryandtowncity()
		.continue2();
		
	}

}
