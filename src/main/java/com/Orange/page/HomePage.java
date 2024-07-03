package com.Orange.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRm.base.baseClass;

public class HomePage extends baseClass{
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")
	WebElement admintab;
	
	public HomePage() {
    	PageFactory.initElements(driver, this);
	}
	public AdminPage ClickOnAdminTab() {
		admintab.click();
		return new AdminPage();
	}

}
