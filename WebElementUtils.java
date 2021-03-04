package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementUtils {

	public void click(WebDriver driver, WebElement element) {
		
		scrollElementIntoView(driver, element);
		waitForElement(driver, element, 5);
		element.click();
	}
	
	public void waitForElement(WebDriver driver, WebElement element, int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void scrollElementIntoView(WebDriver driver, WebElement element) {
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
}
