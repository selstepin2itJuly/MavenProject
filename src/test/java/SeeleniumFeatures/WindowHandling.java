package SeeleniumFeatures;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import SeleniumOne.BaseClass;

public class WindowHandling{
	static WebDriver dr;
	public static void main(String[] args) throws InterruptedException {
		//BaseClass bt=new BaseClass();
		dr=BaseClass.init("chrome", "https://www.instagram.com/?hl=en");
		dr.findElement(By.xpath("//*[@id='react-root']/section/main/article/div[2]/div[3]/div/a[1]/img")).click();
		dr.findElement(By.xpath("//*[@id='react-root']/section/main/article/div[2]/div[3]/div/a[2]/img")).click();
		Thread.sleep(2000);
		Set<String> handle = dr.getWindowHandles();
		Iterator<String> itr=handle.iterator();
		String mainWin = itr.next();
		String gWin = itr.next();
		String appWin = itr.next();
	
		Thread.sleep(2000);
		dr.switchTo().window(appWin);
		dr.findElement(By.xpath("//*[@id='ac-globalnav']/div/ul[2]/li[6]/a")).click();
		Thread.sleep(2000);
		dr.close();
		dr.switchTo().window(gWin);
		dr.findElement(By.xpath("//*[@id='fcxH9b']/div[4]/c-wiz/div/div[2]/div/div[2]/c-wiz[2]/c-wiz/c-wiz/c-wiz/div/div[1]/div[2]/a")).click();
		Thread.sleep(2000);
		dr.close();
		dr.switchTo().window(mainWin);
		dr.findElement(By.name("fullName")).sendKeys("dfsawfwejncdwiocnweioncpew");
		dr.findElement(By.name("emailOrPhone")).sendKeys("1454312652564");
		Thread.sleep(2000);
		dr.quit();
	}

}
