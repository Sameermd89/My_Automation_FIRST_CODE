package com.Orange.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRm.base.baseClass;

public class Loginpage extends baseClass{
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement Username;
    @FindBy(xpath="//input[@placeholder='Password']")
    WebElement Password;
    @FindBy(xpath="//button[@type='submit']")
    WebElement Login;
    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img")
    WebElement logo;
    
    public Loginpage() {
    	PageFactory.initElements(driver, this);
    }
    
    public Boolean validateLogo() {
    	logo.isDisplayed();
    	return true;
    }
   
    public HomePage login(String uname,String pword) {
    	Username.sendKeys(uname);
        Password.sendKeys(pword);
        Login.click();
        return new HomePage() ;
    }
    

}
