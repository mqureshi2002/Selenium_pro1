package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotations {
	@AfterSuite
	public void aftersuite() {
		Reporter.log("after suite is executed",true);
	}
	@BeforeSuite
	public void beforeuite() {
		Reporter.log("before suite is executed",true);

}
	@AfterTest
	public void aftertest() {
		Reporter.log("after test is executed",true);
	}
	@BeforeTest
	public void beforetest() {
		Reporter.log("before test is executed",true);
	}
	@BeforeClass
	public void beforeclass() {
		Reporter.log("before class is executed",true);
	}
	@AfterClass
	public void afterclass() {
		Reporter.log("after class is executed",true);
	}
	@BeforeMethod
	public void beforemethod() {
		Reporter.log("before method is executed",true);
	}
	@AfterMethod
	public void aftermethod() {
		Reporter.log("after method is executed",true);
	}
	@Test
	public void demo() {
		Reporter.log("test script is executed",true);
	}
	@Test
	public void demo1() {
		Reporter.log("test script is executed",true);
	}}
