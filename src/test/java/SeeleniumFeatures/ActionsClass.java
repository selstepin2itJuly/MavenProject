package SeeleniumFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import SeleniumOne.BaseClass;

public class ActionsClass {

// This is Action Class
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = BaseClass.init("chrome", "https://www.icicibank.com/");
		//dr.findElement(By.xpath("//*[@id='gobutton']")).click();
		boolean b=false;
		try {
	          b = dr.findElement(By.xpath("//*[@class='push-popup desktop-only']/child::div[@id='push-modal-content']/child::div[@id='push-modal-close']")).isDisplayed();
       }
       catch(Exception e) {
    	   e.printStackTrace();
       }
		if(b==true) {
			dr.findElement(By.xpath("//*[@class='push-popup desktop-only']/child::div[@id='push-modal-content']/child::div[@id='push-modal-close']")).click();
		}
		Actions sc=new Actions(dr);
		/*WebElement toElement=dr.findElement(By.xpath("//*[@id='main']/div[2]/ul/li[@class='personal-mobile-3 shorter']/child::a[contains(@href,'payments')]"));
		sc.moveToElement(toElement).build().perform();
		Thread.sleep(2000);
		Point p = dr.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[9]/a/span")).getLocation();
		p.getX();
		p.getY();
		System.out.println(p.getX()+":"+p.getY());
		//sc.moveToElement(dr.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[9]/a/span")), p.getX()-30, p.getY()).build().perform();
		sc.click(dr.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[9]/a/span"))).build().perform();
		dr.navigate().back();*/
		
		WebElement element = dr.findElement(By.xpath("//*[@id='Search'][@class='ui-autocomplete-input']"));
		Thread.sleep(3000);
		//sc.click(element).build().perform();
		sc.sendKeys(element,Keys.SHIFT).build().perform();
		sc.sendKeys("Loan").build().perform();
		//sc.sendKeys(Keys.SHIFT).release().build().perform();
		sc.sendKeys(Keys.SHIFT).build().perform();;
		sc.sendKeys("car").build().perform();;
		sc.sendKeys(Keys.RETURN).build().perform();
		
	}

}
