package com.OrangeHRm.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;

import com.Orange.page.Loginpage;

public class baseClass {
	public WebDriver driver;
	public Loginpage loginpage;
	@BeforeMethod
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.Edge.driver", "D:\\selenium\\msedgedriver.exe");
		 driver = new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		loginpage =new Loginpage();
	}
	public void Teardown() {
		driver.close();
	}
}