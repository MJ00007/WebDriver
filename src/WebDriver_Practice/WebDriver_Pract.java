package WebDriver_Practice;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.Key;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import Base.initiateDriver;


public class WebDriver_Pract extends initiateDriver {
	
	
	@Ignore
	public void TC01() {
		driver.get("https://mail.google.com");
		System.out.println("Hello");
	}
	
	
	@Ignore@Test(priority=3)
	public void TC02() throws IOException {
		Compare Compare2 = new Compare();
		Properties property = new Properties();
		File f = new File("Configs/configs.properties");
		FileReader fr = new FileReader(f);
		property.load(fr);
		String Result = property.getProperty("Username ");
		System.out.print(Result);
		Assert.assertFalse(Compare.compareURL(driver, "sdsd"), "This is incorrect URL");
		
		//Assert.assertTrue(Compare.compareURL(driver, "www.gmail3.com"), "This is incorrect URL2");
	}
	
	@Ignore@Test(priority=2)
	public void TC03() {
		driver.get("https://mail.google.com");
		Assert.assertFalse(validateusingXpath.validateusingXpathmethod(driver, "/111"), "The element was not found");
	}
	
	@Ignore@Test(priority = 2)
	public void TC04(){
		driver.get("https://www.facebook.com/");
		boolean resultset = compareTestonElement.compareTestonElements(driver, "/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]", "Log In");
		Assert.assertEquals(resultset, true, "[ERROR - Text not found]");
	}
	
	@Ignore@Test(priority = 2)
	public void TC05(){
		driver.get("https://www.facebook.com/");
		boolean resultset = compareTestonElement.compareTestonElements(driver, "/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]", "Log In");
		Assert.assertEquals(resultset, true, "[ERROR - Text not found]");
	}
	
	@Ignore@Test(priority=1)
	public void TC06() throws InterruptedException {
		driver.navigate().to("https://www.thetestingworld.com/testings/");
		Select sex = new Select(driver.findElementByName("sex"));
		sex.selectByIndex(1);
		
		Thread.sleep(5000);
		Select country = new Select(driver.findElementById("countryId"));
		country.selectByValue("101");
		
		Thread.sleep(5000);
		Select state = new Select(driver.findElementById("stateId"));
		state.selectByVisibleText("Maharashtra");
		
		Thread.sleep(5000);
		Select city = new Select(driver.findElementById("cityId"));
		city.selectByVisibleText("Pune");
		
		System.out.print("Current Selected Sex Value:" + country.getFirstSelectedOption().getText());
		
		List<WebElement> e1 = country.getOptions();
		for(WebElement e : e1) {
			System.out.print("The value present for sex are:" + e.getText());
		}
	}
	
	

	
	@Ignore@Test
	public void loginFB() {
		driver.navigate().to("https://www.facebook.com");
		driver.findElementById("email").sendKeys("Manoj");
		Actions Act = new Actions(driver);
		Act.sendKeys(Keys.TAB).perform();;
		Act.sendKeys("Chaitrali").perform();
		Act.sendKeys(Keys.TAB).perform();;
		Act.sendKeys(Keys.ENTER);
	}
	
	
	@Ignore@Test(groups = "High", priority = 1)
	public void TC07() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver_99.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.thetestingworld.com/testings/");
		Select sel = new Select(driver.findElementByName("sex"));
		sel.selectByIndex(1);
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
	}
	
	@Ignore@Test
	public void TC08() {
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com");
		driver.findElementById("email").sendKeys("Manoj");
		Actions Act = new Actions(driver);
		//String e = driver.findElementByXPath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input").getText();
		Act.doubleClick(driver.findElementByXPath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
//		Act.sendKeys(Keys.TAB).perform();
		Act.sendKeys("Chaitrali").perform();
		
//		Act.sendKeys(Keys.TAB).perform();;
//		Act.sendKeys(Keys.ENTER);
	}
	
	
	@Ignore@Test(priority=1)
	public void TC09() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://www.thetestingworld.com/testings/");
		Select sex = new Select(driver.findElementByName("sex"));
		sex.selectByIndex(1);
		
		
		Select country = new Select(driver.findElementById("countryId"));
		country.selectByValue("101");
		

		Select state = new Select(driver.findElementById("stateId"));
		state.selectByVisibleText("Maharashtra");
		

		Select city = new Select(driver.findElementById("cityId"));
		city.selectByVisibleText("Pune");
		
		System.out.print("Current Selected Sex Value:" + country.getFirstSelectedOption().getText());
		
		List<WebElement> e1 = country.getOptions();
		for(WebElement e : e1) {
			System.out.print("The value present for sex are:" + e.getText());
		}}
		
		@Test(groups = "Wait", priority = 1)
		public void TC10() throws InterruptedException{
			driver.navigate().to("https://www.thetestingworld.com/testings/");
			System.out.println("TC10");
			WebDriverWait wait = new WebDriverWait(driver, 20);
			Select sex = new Select(driver.findElementByName("sex"));
			sex.selectByIndex(1);
			
			wait.until(ExpectedConditions.textToBePresentInElement(driver.findElementById("countryId"), "India"));
			Select country = new Select(driver.findElementById("countryId"));
			country.selectByValue("101");
			
			wait.until(ExpectedConditions.textToBePresentInElement(driver.findElementById("stateId"), "Maharashtra"));
			Select state = new Select(driver.findElementById("stateId"));
			state.selectByVisibleText("Maharashtra");
			
			wait.until(ExpectedConditions.textToBePresentInElement(driver.findElementById("cityId"), "Pune"));
			Select city = new Select(driver.findElementById("cityId"));
			city.selectByVisibleText("Pune");
			
			System.out.print("Current Selected Sex Value:" + country.getFirstSelectedOption().getText());
			
			List<WebElement> e1 = country.getOptions();
			for(WebElement e : e1) {
				System.out.print("The value present for Country are:" + e.getText());
			}
			
			List<WebElement> s = sex.getOptions();
			for(WebElement s1:s) {
				System.out.println("The values for sex are" + s1.getText());
			}
			
	}
	
	
	
	
	
	
	
}






