package SeeleniumFeatures;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import SeleniumOne.BaseClass;

public class AlertHandling extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = init("chrome","http://ksrtc.in/oprs-web/");
		driver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).click();
		Thread.sleep(2000);
		
		Alert at = driver.switchTo().alert();
		System.out.println(at.getText());
		at.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div/a[5]")).click();
	}

}
