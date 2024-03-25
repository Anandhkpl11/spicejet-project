package Page;

import org.openqa.selenium.WebDriver;

import Base.ProjectSpecification;

public class ManageBookingpage extends ProjectSpecification {

	public ManageBookingpage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public ManageBookingpage Managebookingclick() {
		click("xpath", "//*[text()='manage booking']");
		return this;
	}
	
	
	public ManageBookingpage vaildatepage() {
		
		if (driver.getTitle()==null || driver.getTitle().isEmpty()) {
			
			System.out.println("URL is  unreachable");
			
		} else {
			
			System.out.println("URL is reachable and valid");
		}
		return this;
	}
}
