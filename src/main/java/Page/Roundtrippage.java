package Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.ProjectSpecification;

public class Roundtrippage extends ProjectSpecification{

	public Roundtrippage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public Roundtrippage from()  {
		
		sendkey("xpath", "(//*[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]", "mumbai");
		
		return this;
	}
	
	
	public Roundtrippage To() {
		driver.findElement(By.xpath("(//*[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")).clear();
		sendkey("xpath", "(//*[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]", "delhi");
		
		return this;
	}
	
	public Roundtrippage date()   {
		
		
		WebElement startdate = driver.findElement(By.xpath("(//*[text()='8'])[2]"));
		WebElement enaddate = driver.findElement(By.xpath("(//*[text()='12'])[2]"));
		Actions(startdate);
		Action(enaddate);

		return this;
	}
			
	public Roundtrippage passenger() throws InterruptedException {
	click("xpath", "(//*[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]");
	click("xpath", "(//*[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid'])[1]");
	click("xpath", "//*[@data-testid='Adult-testID-minus-one-cta']");
	Thread.sleep(1000);
	
	click("xpath", "//*[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']");
	//click("xpath", "(//*[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa'])[3]");
	return this;
			}
	
	public Roundtrippage searchbtn() {
		click("xpath", "//*[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']");
		return this;
	}
	
	
	public Roundtrippage continuebtn1() {
		click("xpath", "//*[@data-testid='continue-search-page-cta']");
		
		return this;
	}
	
	public Roundtrippage contactdetail() {
		click("xpath", "//*[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']");
		click("xpath", "(//*[@class='css-76zvg2 r-homxoj r-poiln3 r-ubezar'])[1]");
		return this;
	}
		
	public Roundtrippage firstnameandlastname() throws InterruptedException {
		sendkey("xpath", "(//*[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[1]", "Anandh");
		Thread.sleep(3000);
		sendkey("xpath", "//*[@data-testid='last-inputbox-contact-details']", "kumar");
		return this;
	}
	
	public Roundtrippage phonenumberandEmailandcountryandtowncity() {
		sendkey("xpath", "(//*[@class='css-1cwyjr8 r-1yadl64 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[1]", "7502189905");
		sendkey("xpath", "(//*[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[3]", "anandhakumarak11@gmail.com");
		click("xpath", "(//*[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[3]");
		sendkey("xpath", "//*[@class='css-1cwyjr8 r-19fu0aa r-kicko2 r-1862ga2 r-13awgt0 r-poiln3 r-1enofrn r-10paoce r-ymttw5 r-5njf8e r-b8lwoo']", "india");
		click("xpath", "(//*[@class='css-76zvg2 r-qsz3a2 r-poiln3 r-n6v787 r-1e081e0 r-oyd9sg'])[2]");
		sendkey("xpath", "(//*[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[4]", "Bangaluru");
		return this;
	}
	
	public void continue2() throws InterruptedException {
		
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//*[@width='100%'])[4]"))));
		
	    WebElement checkbox = driver.findElement(By.xpath("(//*[@fill-rule='evenodd'])[5]"));
		
		Actions(checkbox);
		Thread.sleep(3000);
		//javascript(continous);
		 driver.findElement(By.xpath("//*[@data-testid='traveller-info-continue-cta']")).click();
		//click("xpath", "//*[@id='at_addon_close_icon']");
		click("xpath", "(//*[@data-testid='add-ons-continue-footer-button'])[3]");
		
	}
	
	public void payment() {
		
		click("xpath", "//*[@data-testid='common-proceed-to-pay']");
		
	}

}
