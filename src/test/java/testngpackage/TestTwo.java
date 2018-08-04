package testngpackage;

import org.testng.annotations.Test;

import SeleniumOne.BaseClass;

import org.testng.annotations.BeforeMethod;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestTwo {
  @Test(description="Successful Login ", priority=1, groups= {"sanity","Reg","Functional"})
  public void loginSuccess() {
	  //System.out.println("Login Success");
	  System.out.println("Successful Login to Facebook");
		dr.findElement(By.id("email")).clear();
		dr.findElement(By.id("email")).click();
		dr.findElement(By.id("email")).sendKeys("fakhrulhasan2002@gmail.com");
		dr.findElement(By.id("pass")).sendKeys("dsavrtgte");
		dr.findElement(By.id("loginbutton")).click();
		String expected = dr.findElement(By.xpath("//*[@id='login_link']/descendant::a[@role='button']")).getText();
		String actual = "Recover Your Account";
		//assertNotEquals(expected, actual);
	  
  }
 
  WebDriver dr;
  @BeforeClass(alwaysRun=true)
  public void beforeClass() {
	  System.out.println("Before Class");
	  dr = BaseClass.init(TestOne.browser, "http://www.facebook.com");
  }

  @AfterClass(alwaysRun=true)
  public void afterClass() {
	  System.out.println("After Class");
	  dr.close();
  }
}
