package com.OrangeHRM.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Orange.page.HomePage;

import com.OrangeHRm.base.baseClass;

public class HomePageTest extends baseClass{
	
    // Loginpage loginpage;
	HomePage homepage;
	@Test(priority=3)
	public void AdminTabTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5000, null);
		homepage=loginpage.login("Admin", "admin123");
		homepage.ClickOnAdminTab();
		Thread.sleep(3000);
		String ExpectedURl="https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
	    String ActualURL=driver.getCurrentUrl();
		Assert.assertEquals(ActualURL, ExpectedURl);
		
	}
}
