package com.OrangeHRM.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Orange.page.HomePage;
import com.Orange.page.Loginpage;
import com.OrangeHRm.base.baseClass;

public class LoginTest extends baseClass {
	
	//Loginpage loginpage;
	HomePage homepage;
	
	
	@Test(priority=1)
	public void verifyLogo() throws InterruptedException {
		Thread.sleep(2000);
		Boolean Flag=loginpage.validateLogo();
		Assert.assertTrue(Flag);
	} 
	@Test(priority=2)
	public void loginTest() throws InterruptedException {
		Thread.sleep(2000);
		homepage= loginpage.login("Admin","admin123");
		String ExpectedURl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	    String ActualURL=driver.getCurrentUrl();
		Assert.assertEquals(ActualURL, ExpectedURl);
	}


}
