package Until;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Utilize {
	
	public static WebDriver driver;
	
	public void lanuchbrowser(String browser) {
		
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			} else if(browser.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			} else if(browser.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			}
		
	}
	
	
	public void headlessbrowse(String url) {
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu"); 
        WebDriver driver = new ChromeDriver(options);
        driver.get(url);
		
	}
	
	public void url(String url) {
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	
	public void input(String locator,String Attributevalue,String value) {
		
		if (locator.equalsIgnoreCase("id")) {
			
			driver.findElement(By.id(Attributevalue)).sendKeys(value);
			
		} else if(locator.equalsIgnoreCase("name")) {
			
			driver.findElement(By.name(Attributevalue)).sendKeys(value);

		} else if(locator.equalsIgnoreCase("class")) {
			
			driver.findElement(By.className(Attributevalue)).sendKeys(value);
			
		} else if(locator.equalsIgnoreCase("xpath")) {
			
			driver.findElement(By.xpath(Attributevalue)).sendKeys(value);
			
		} else if(locator.equalsIgnoreCase("linktext")) {
			
			driver.findElement(By.linkText(Attributevalue)).sendKeys(value);
			
		} else if(locator.equalsIgnoreCase("partiallinktext")) {
			
			driver.findElement(By.partialLinkText(Attributevalue)).sendKeys(value);
			
		} else if(locator.equalsIgnoreCase("cssSelector")) {
			
			driver.findElement(By.cssSelector(Attributevalue)).sendKeys(value);
			
		}
		
	}
	
	
	public void enter(String locator,String Attributevalue) {
		
		if (locator.equalsIgnoreCase("id")) {
			
			driver.findElement(By.id(Attributevalue)).click();
			
		} else if(locator.equalsIgnoreCase("name")) {
			
			driver.findElement(By.name(Attributevalue)).click();

		} else if(locator.equalsIgnoreCase("class")) {
			
			driver.findElement(By.className(Attributevalue)).click();
			
		} else if(locator.equalsIgnoreCase("xpath")) {
			
			driver.findElement(By.xpath(Attributevalue)).click();
			
		} else if(locator.equalsIgnoreCase("linktext")) {
			
			driver.findElement(By.linkText(Attributevalue)).click();
			
		} else if(locator.equalsIgnoreCase("partiallinktext")) {
			
			driver.findElement(By.partialLinkText(Attributevalue)).click();
			
		} else if(locator.equalsIgnoreCase("cssSelector")) {
			
			driver.findElement(By.cssSelector(Attributevalue)).click();
			
		}
		
	}
	
	public void close() {
		
		driver.close();
		
	}
	
	public String[][] exceldata() throws IOException {
		
		String data="C:\\Users\\HAPPY\\Desktop\\GUVI Project\\SpiceJet\\exceldata\\Logindata.xlsx";
		
		XSSFWorkbook book=new XSSFWorkbook(data);
		XSSFSheet sheetAt = book.getSheetAt(0);
		
		int rowcount = sheetAt.getLastRowNum();
		short colunmcount = sheetAt.getRow(0).getLastCellNum();
		
		
		
		String [][] testdata=new String[rowcount][colunmcount];
		
		
		for(int i=1;i<=rowcount;i++) {
			XSSFRow row = sheetAt.getRow(i);
			
			for(int j=0;j<colunmcount;j++) {
				
				XSSFCell cell = row.getCell(j);
				testdata[i-1][j] = cell.getStringCellValue();
				
			}
		}
		
		book.close();
		return testdata;
		
	}	
	
	
	
	public void javascriptscroll(WebElement link ) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", link);
		
	}
		
		
		
	public void Selectdrop(String locator, String attributevalue,String visbletext) {
		
		if (locator.equalsIgnoreCase("id")) {
			WebElement id = driver.findElement(By.id(attributevalue));
			Select drop=new Select(id);
			drop.selectByVisibleText(visbletext);
		} else if(locator.equalsIgnoreCase("xpath")) {
			WebElement xpath = driver.findElement(By.xpath(attributevalue));
			Select drop=new Select(xpath);
			drop.selectByVisibleText(visbletext);
		}else if(locator.equalsIgnoreCase("cssselector")) {
			WebElement css = driver.findElement(By.cssSelector(attributevalue));
			Select drop=new Select(css);
			drop.selectByVisibleText(visbletext);
		}else if(locator.equalsIgnoreCase("class")) {
			WebElement ele = driver.findElement(By.className(attributevalue));
			Select drop=new Select(ele);
			drop.selectByVisibleText(visbletext);
		}
		
	}
	
	
	 public String Screenshot(String Screenshotname) throws IOException {

		 String path="C:\\Users\\HAPPY\\Desktop\\GUVI Project\\SpiceJet\\reportpictures"+Screenshotname+".png";
		 
		 TakesScreenshot screenshot=(TakesScreenshot)driver;
		 File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
		 
		 File desfile=new File(path);
		 FileHandler.copy(sourcefile, desfile);
		 
		 return path;

	}
		
	public void windowhandle() {
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String>list=new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(list.get(1));
		
	}	
		
		
	public void Action(WebElement ele) {
		
		Actions action=new Actions(driver);
		action.click(ele).perform();
		
	}	
		

}
