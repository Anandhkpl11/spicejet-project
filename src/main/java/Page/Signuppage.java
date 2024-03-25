package Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.ProjectSpecification;

public class Signuppage extends ProjectSpecification {
	
	
public Signuppage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	public Signuppage Title() {
		
		
		dropdown("xpath", "//*[@class='form-control form-select ']", "Mr");
		
		return this;
	}
	
	public Signuppage Firstname() {
		
		sendkey("id", "first_name", "Anandh");
		
		return this;
	}
	
	public Signuppage lastname() {
		
		sendkey("id", "last_name", "kumar");
		
		return this;
	}

	public Signuppage country() {
		
		dropdown("xpath", "//*[@class='form-control form-select']", "India ");
		
		return this;
	}
	
	public Signuppage date() {
		
		click("id", "dobDate");
		dropdown("xpath", "//*[@class='react-datepicker__month-select']", "July");
		dropdown("xpath", "//*[@class='react-datepicker__year-select']", "1992");
		click("xpath", "//*[@class='react-datepicker__day react-datepicker__day--001']");
		
		return this;
	}
	
	
	
	
	public Signuppage phonenumber() {
		
		
		sendkey("xpath", " //*[@type='tel']", "8676556734");
		
		return this;
	}
	
	public Signuppage email()  {
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email_id")));
		
		sendkey("id", "email_id", "anandhmoorthi190@gmail.com");
		
		
		
		return this;
	}
	
	public Signuppage password() {
		
		sendkey("id", "new-password", "Moorthi@05");
		sendkey("id", "c-password", "Moorthi@05");
		return this;
	}
	
	
	public Signuppage checkbox() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(70));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='checkbox']")));
		click("xpath", "//*[@type='checkbox']");
		
		return this;
	}
	
	public Signuppage submitbtnb() {
		click("xpath", "//*[@class='btn btn-red']");
		
		return this;
	}
	

}
