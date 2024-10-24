package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global {

	WebDriver driver;
	// Standard Rule: To provide all re-usable functions / Methods

	// Application open details
	public void openApplication() throws Exception {
		System.setProperty("webdriver.gecko.driver",
				"G:\\Programing\\Selenium\\software\\Jarfiles\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(Url);
		System.out.println("Application opened");
		Reporter.log("Application Opened");
		Log.info("Application Opened");
		Thread.sleep(3000);
	}

	// Application closed details
	public void closeApplication() throws Exception {
		driver.close();
		System.out.println("Application Closed");
		Reporter.log("Application Closed");
		Log.info("Application Closed");
		Thread.sleep(3000);
	}

	// Login Details
	public void login() throws Exception {
		driver.findElement(By.name(txt_username)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		Thread.sleep(3000);
		driver.findElement(By.xpath(btn_login)).click();
		System.out.println("Login completed");
		Reporter.log("Login Completed");
		Log.info("Login Completed");
		Thread.sleep(3000);
	}

	// logout details
	public void logout() throws Exception {
		driver.findElement(By.xpath(click_logoutbar)).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout Completed");
		Reporter.log("Logout completed");
		Log.info("Logout completed");
		Thread.sleep(3000);
	}

	// Mouse over to enter the PIM
	public void mouseover() throws Exception {
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath(nav_bar))).click();
		Thread.sleep(4000);
		ac.moveToElement(driver.findElement(By.linkText(link_pim))).perform();
		System.out.println("Mouser over completed");
		Reporter.log("Mouse over completed");
		Log.info("Mouse over completed");
		driver.findElement(By.linkText(link_pim)).click();
		System.out.println("PIM click completed");
		Reporter.log("PIM click completed");
		Log.info("PIM click completed");
		Thread.sleep(5000);
	}

	// Add Employee Details
	public void addemp() throws Exception {

		driver.findElement(By.xpath(btn_Add)).click();
		Thread.sleep(5000);
		driver.findElement(By.name(txt_FN)).sendKeys(FN);
		driver.findElement(By.name(txt_MN)).sendKeys(MN);
		driver.findElement(By.name(txt_LN)).sendKeys(LN);
		driver.findElement(By.xpath(btn_Save)).click();
		System.out.println("New Emp Added");
		Reporter.log("New Emp Added");
		Log.info("New Emp Added");
		Thread.sleep(9000);
	}
}
