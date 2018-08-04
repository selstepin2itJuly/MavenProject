package SeeleniumFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import SeleniumOne.BaseClass;

public class SelectDropDown extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = init("chrome","http://newtours.demoaut.com/mercuryregister.php");
		WebElement e = driver.findElement(By.xpath("//select"));
		Select sl=new Select(e);
		Thread.sleep(2000);
		sl.selectByIndex(10);
		Thread.sleep(2000);
		sl.selectByValue("32");
		Thread.sleep(2000);
		sl.selectByVisibleText("HUNGARY ");
	}

}
