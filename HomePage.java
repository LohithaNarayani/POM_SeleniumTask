package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import drivers.WebDriverUtils;
import Utilities.WebElementUtils;

public class HomePage {
	
	WebDriver driver;
	WebElementUtils webele;
	
	@FindBy(how = How.XPATH, using ="//h5[text()='Interactions']")
	public WebElement interactionsLink;
	
	public HomePage() {
		
		webele = new WebElementUtils();
		
		WebDriverUtils wd = new WebDriverUtils();
		String browser = System.getProperty("browser");
		System.out.println("Browser: "+browser);
		driver = wd.getDriver(browser);
		
		PageFactory.initElements(driver, this);
	}
	
	public void launchHomePage() {
		
		driver.get("https://demoqa.com/");
	}
	
	public String getPageTitle() {
		
		String pageTitle = driver.getTitle();
		
		return pageTitle;
	}
	
	
	public void launchInteractions() {
		
		webele.click(driver, interactionsLink);		
	}
}
