package SeeleniumFeatures;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;

public class Syncronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Date dt = new Date();
		
		 SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	        System.out.println(dt1.format(dt));
		//Webdriver object or instance
		WebDriver driver = new FirefoxDriver();
		System.out.println(dt1.format(dt.getTime()));
		driver.get("http://www.espncricinfo.com");
		
		/*driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);		
		System.out.println(dt1.format(dt.getTime()));
		driver.findElement(By.xpath("//*[@id='main-container']/div/section[3]/div[1]/header/h1")).click();

		System.out.println(dt1.format(dt.getTime()));
		Thread.sleep(2000);
		*/
		/*FluentWait<WebDriver> fl = new FluentWait<WebDriver>(driver).withTimeout(15, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS);
		fl.until((Predicate<WebDriver>)driver.findElement(By.xpath("//*[@id='main-container']/div/section[3]/div[1]/header/h1")));*/
	
		WebDriverWait wait = new WebDriverWait(driver, 15);
	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='main-container']/div/section[3]/div[1]/header/h1"))));
	    element.click();
	}

}
