package org.junit;

import org.bouncycastle.util.Selector;
import org.checkerframework.checker.units.qual.s;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BrowserLaunch extends BaseClass {

	public static BaseClass b = new BaseClass();
	public static LoginPage l = new LoginPage();

	@BeforeClass
	public static void BrowserLaunch() {

		try {
			b.getDriver(b.excelRead(2,7));

			System.out.println("Browser Launched Successfully");
		} catch (Exception e) {
			System.out.println("Browser Not launched" + e.getMessage());
		}
	}

	@Before
	public void UrlLaunch() {
		try {
			b.getUrl(b.excelRead(2, 6));

			System.out.println("Url Launched successfully");
		} catch (Exception e) {
			System.out.println("Url Not launched" + e.getMessage());
		}
	}

	@Test
	public void EnterCrendials() {

		try {
			l = new LoginPage();
			WebElement username = l.getUsername();
			username.sendKeys(b.excelRead(2, 4));
			WebElement password = l.getPassword();
			password.sendKeys(b.excelRead(2, 5));

			System.out.println("Credentials are Entered Successfully");
		} catch (Exception e) {
			System.out.println("Credentials are Not Entered" + e.getMessage());
		}
	}

	@After
	public void LoginButtonClick() {

		try {
			l = new LoginPage();
			WebElement login = l.getLogin();
			login.click();

			System.out.println("Login Button Clicked Successfully");
		} catch (Exception e) {
			System.out.println("Login Button Not Clicked" + e.getMessage());
		}
//		try {
//			l = new LoginPage();
//			WebElement location = l.getLocaion();
//			b.selectByIndex(location, 6);
//
//		} catch (Exception e) {
//
//			System.out.println("Location selected Successfully" + e.getMessage());
//		}
//		
	}

}