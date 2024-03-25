package Test;

import org.testng.annotations.Test;

import Base.ProjectSpecification;
import Page.Homepage;

public class Tc_003OneWaytrip extends ProjectSpecification {
	
	
	@Test
	public void onewaytrip() throws InterruptedException {
		
		Homepage obj=new Homepage(driver);
		lanuchbrowser("chrome");
		geturl("https://www.spicejet.com/");
		
		obj.oneway().from().To().date().passenger().searchbtn().continuebtn1()
		.contactdetail().firstnameandlastname().phonenumberandEmailandcountryandtowncity()
		.passenger1detail().continuebtn().paymentoptional();
		
	}

}
