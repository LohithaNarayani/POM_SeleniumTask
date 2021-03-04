package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.HomePage;

public class HomePageTest {
	
		HomePage homePage;
		
		@BeforeSuite
		public void beforeSuite() {
			homePage = new HomePage();
		}

		@Test
		public void testLaunchHomePage() {
			
			homePage.launchHomePage();
		}
		
		@Test(dependsOnMethods = "testLaunchHomePage")
		public void launchInteractions() {
			
			homePage.launchInteractions();
		}
		
		@AfterSuite
		public void afterSuite() {

		}
	}


