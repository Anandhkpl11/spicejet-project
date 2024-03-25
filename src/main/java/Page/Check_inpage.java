package Page;

import org.openqa.selenium.WebDriver;

import Base.ProjectSpecification;

public class Check_inpage extends ProjectSpecification {

	public Check_inpage(WebDriver driver) {

		this.driver=driver;
	}
	
	public Check_inpage check() {
		click("xpath", "//*[text()='check-in']");
		return this;
		
	}
	public Check_inpage vaildatepage() {
		
		if (driver.getTitle()==null || driver.getTitle().isEmpty()) {
			
			System.out.println("URL is  unreachable");
			
		} else {
			
			System.out.println("URL is reachable and valid");
		}
		return this;
	}

}
