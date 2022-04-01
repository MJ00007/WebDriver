package Base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class initiateDriver {
	
	public ChromeDriver driver;
	@BeforeClass
	public void StartBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver_99.exe");
		driver = new ChromeDriver();
	}
	
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	

}
