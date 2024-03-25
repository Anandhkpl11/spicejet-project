package Test;



import org.testng.annotations.Test;

import Base.ProjectSpecification;
import Page.Homepage;

public class Tc_002Login extends ProjectSpecification {
	
	@Test(dataProvider = "readdata")
	public void login(String username ,String password) {
		
		Homepage obj=new Homepage(driver);
		lanuchbrowser("chrome");
		geturl("https://www.spicejet.com/");
		
		obj.login().emailbtn().email(username).password(password).loginbtn();
		closeBrowser();
	}

}
