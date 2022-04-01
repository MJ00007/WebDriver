package WebDriver_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class validateusingXpath {
	
public static boolean validateusingXpathmethod(WebDriver driver, String xpath) {
	boolean result=false;	
try {
	driver.findElements(By.xpath(xpath));
	result = true;
	}
catch(Exception e) {
	
}
return result;
}
}
