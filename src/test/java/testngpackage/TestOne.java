package testngpackage;

import org.testng.annotations.Test;

import SeleniumOne.BaseClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestOne{
	
	static String browser;
	static String url="http://www.google.com";
	WebDriver dr;
	
	@Parameters({"user","pass"})
	@Test(description="Login Function", priority=1,enabled=true,groups= {"Reg"})
	public void testOne(String username , String password) {
		System.out.println("Login to Facebook");
		dr.findElement(By.id("email")).clear();
		dr.findElement(By.id("email")).click();
		dr.findElement(By.id("email")).sendKeys(username);
		dr.findElement(By.id("pass")).sendKeys(password);
		dr.findElement(By.id("loginbutton")).click();
		String expected = dr.findElement(By.xpath("//*[@id='login_link']/descendant::a[@role='button']")).getText();
		String actual = "Recover Your Account";
		assertEquals(expected, actual);
	}
	
	@Test(description="Forgot Link",  priority=3,  dependsOnMethods="testOne",enabled= true, groups= {"Reg"})
	public void testTwo() {
		System.out.println("Check Forget account Link");
		dr.findElement(By.partialLinkText("Forgot")).click();
		String expected = dr.findElement(By.xpath("//*[@id=\"identify_yourself_flow\"]/div/div[2]/div/table/tbody/tr[1]/td[2]/div")).getText();
		String actual = "Please enter your email or phone number to search for your account.";
		assertEquals(expected, actual);
	}
	
	@Test(description="Refress the page", priority=2,timeOut=13000,groups= {"functional"})
	public void testThree() {
		System.out.println("Refresh and verify page");
		dr.navigate().refresh();
		assertTrue(dr.findElement(By.id("loginbutton")).isDisplayed());
	}
  @BeforeMethod(alwaysRun=true)
  public void beforeMethod() {
	  System.out.println("Before Method");
	  dr.navigate().to("http://www.facebook.com");
  }

  @AfterMethod(alwaysRun=true)
  public void afterMethod() {
	  System.out.println("After Method");
	  //dr.close();
  }

  @BeforeTest(alwaysRun=true)
  public void beforeTest() {
	  System.out.println("Before Test");
	  dr = BaseClass.init(browser, url);
  }

  @AfterTest(alwaysRun=true)
  public void afterTest() {
	  System.out.println("After Test");
	  dr.close();
  }

  @BeforeSuite(alwaysRun=true)
  public void beforeSuite() {
	  System.out.println("Before Suite");
	  browser = "chrome";
  }

  @AfterSuite(alwaysRun=true)
  public void afterSuite() {
	  System.out.println("After Suite");
	  System.out.println("Generate Report");
	  
  }
  

}
