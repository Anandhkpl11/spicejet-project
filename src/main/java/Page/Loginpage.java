package Page;

import org.openqa.selenium.WebDriver;

import Base.ProjectSpecification;

public class Loginpage extends ProjectSpecification {
	
public Loginpage(WebDriver driver) {
		
		this.driver=driver;
	}

	public Loginpage emailbtn() {
		click("xpath", "//*[text()='Email']");
		return this;
	}
	
	
	public Loginpage email(String value) {
		sendkey("xpath", "//*[@type='email']", value);
		return this;
	}
	
	public Loginpage password(String value) {
		sendkey("xpath", "(//*[@type='password'])[1]", value);
		return this;
	}
	
	public Loginpage loginbtn() {
		click("xpath", "(//*[@data-testid='login-cta'])[1]");
		return this;
		
	}

}
