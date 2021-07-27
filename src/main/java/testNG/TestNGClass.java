package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClass {
	
	
@BeforeSuite
public void setUp() {
	System.out.println("setup system property for chrome");
}
	@BeforeClass
public void lanuchBrowser() {
	System.out.println("Launch chrome browser");
}
	
@BeforeMethod
public void enter() {
	System.out.println("Enter URL");
}
	
	@BeforeTest
	public void login() {
		System.out.println("login method");
	}
	
@Test 

public void googleTitle() {
	System.out.println("Googel Title Test");
}

@AfterMethod
public void logout () {
	System.out.println("logout from app");
}

@AfterTest
public void deleteAllCooKies() {
	System.out.println("delete all cookies");
}

@AfterClass
public void closebrowser() {
	System.out.println("close browser");
}


@AfterSuite
public void generateReport() {
	System.out.println("GenerateReport");
}





}
