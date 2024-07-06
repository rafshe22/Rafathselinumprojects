package com.itlearn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LLoginpage {
	
	public static final String Logout = null;
	WebDriver driver;
	
	public LLoginpage(WebDriver driver) {
driver=driver; 

PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id="loginlabel") WebElement loginclick;
	@FindBy(id="user_login")WebElement user;
	@FindBy(id="user_pass")WebElement pass;
	@FindBy(id="wp-submit")WebElement clicksubmit;
	
@FindBy(xpath="//*[@id=\"gk-login-toggle\"]/i") WebElement logoutimage;
	
	@FindBy(xpath="//*[@id=\"login_drop_panel\"]/div/ul/li[3]/a") WebElement logoutclick;
	
	public void login(String username, String password) {
		
		loginclick.click();
		user.sendKeys(username);
		pass.sendKeys(password);
		clicksubmit.sendKeys();
	}



public void logout()
{
	logoutimage.click();
	logoutclick.click();
}



public void Logout() {
	// TODO Auto-generated method stub
	
}


}