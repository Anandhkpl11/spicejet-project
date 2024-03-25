package Base;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

import Until.Utilize;

public class ProjectSpecification extends Utilize {
	
	
public void Browser(String Browser) {
		
		lanuchbrowser(Browser);
		
	}
	
	
	public void headlessbrowserchrome(String url) {
		headlessbrowse(url);
		
	}
	
	public void geturl(String url) {
		
		url(url);
		
	}
	
	public String getscreenshot(String screenshotname) throws IOException {
		
		return Screenshot(screenshotname);
		
	}
	
	public void sendkey(String locator,String Attributevalue,String value) {
		
		input(locator, Attributevalue, value);
		
	}
	
	public void javascript(WebElement link) {
		
		javascriptscroll(link);
		
	}
	
	
	
	public void click(String locator,String Attributevalue) {
		
		enter(locator, Attributevalue);
		
		
	}
	
	public void Actions(WebElement ele) {
		Action(ele);
		
	}
	@DataProvider
	public String[][] readdata() throws IOException {
		
		String[][] testdata = exceldata();
		return testdata;
		
	}
	
	
	public void dropdown( String locator,String value,String visbletext) {
		Selectdrop(locator, value, visbletext);
	}
	
	public void getwindowhandle() {
		windowhandle();
	}
	
	public void closeBrowser() {
		
		close();
		
	}

}
