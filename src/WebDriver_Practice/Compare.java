package WebDriver_Practice;

import org.openqa.selenium.WebDriver;

public class Compare {

	public static boolean compareURL(WebDriver driver, String expResult) {
		boolean result = false;
		if(driver.getCurrentUrl().equalsIgnoreCase(expResult))
				{
					result = true;
				}
	 return result;	
	}
	
}
