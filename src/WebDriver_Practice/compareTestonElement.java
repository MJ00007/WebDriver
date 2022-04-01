package WebDriver_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class compareTestonElement {
	
	public static boolean compareTestonElements(WebDriver driver, String xpath, String expText) {
		String validateName=driver.findElement(By.xpath(xpath)).getText();
		boolean result;
		if(validateName.equals(expText))
		{
			result=true;
		}
		else {
			result = false;
		}
		return result;
	}
	
}
