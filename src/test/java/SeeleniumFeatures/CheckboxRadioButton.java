package SeeleniumFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import SeleniumOne.BaseClass;

public class CheckboxRadioButton extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		String url="http://toolsqa.com/automation-practice-form/";
		driver=init("chrome",url);
		WebElement e = driver.findElement(By.xpath("//*[@value='Male']"));
		e.isDisplayed();
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", e);
		/*for(int i=0;i<100;i++) {
		je.executeScript("window.scroll(0,200)", "");
		boolean c=false;
		try {
			c=e.isDisplayed();
			if(c=true)
				break;
			else
				continue;
		}catch(Exception et) {}
		
		}*/
		if(e.isDisplayed())
		//je.executeScript("window.scroll(0,900)", "");
		Thread.sleep(2000);
		
		//radio button
		/*boolean b = driver.findElement(By.xpath("//*[@value='Male']")).isSelected();
		System.out.println(b);
		if(b==false) {
			driver.findElement(By.xpath("//*[@value='Female']")).click();
		}
		b=driver.findElement(By.xpath("//*[@value='Male']")).isSelected();
		if(b==true) {
			
			b=driver.findElement(By.xpath("//*[@value='5']")).isSelected();
			if(b==false) {
			    driver.findElement(By.xpath("//*[@value='5']")).click();
			}
	}*/
		
		//checkbox
		
		boolean b = driver.findElement(By.xpath("//*[@value='Manual Tester']")).isSelected();
		
		if(b==false)
			driver.findElement(By.xpath("//*[@value='Manual Tester']")).click();
	}
}
