package org.junit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBys({ @FindBy(id = "username"), @FindBy(xpath = "//input[@type='text']") })
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindAll({ @FindBy(how = How.ID, using = "passgdword"), @FindBy(how = How.NAME, using = "password") })
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(how = How.ID, using = "login")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

}