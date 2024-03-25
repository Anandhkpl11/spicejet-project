package Page;

import org.openqa.selenium.WebDriver;

import Base.ProjectSpecification;

public class Flightstatuspage  extends ProjectSpecification {

	public Flightstatuspage(WebDriver driver) {
	
		this.driver=driver;
	}
	
	public Flightstatuspage clickflightstatus() {
		click("xpath", "//*[text()='flight status']");
		return this;
	}
	
	
	public Flightstatuspage vaildatepage() {
		
		if (driver.getTitle()==null || driver.getTitle().isEmpty()) {
			
			System.out.println("URL is  unreachable");
			
		} else {
			
			System.out.println("URL is reachable and valid");
		}
		return this;
	}

}
