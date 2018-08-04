package SeeleniumFeatures;

import org.openqa.selenium.WebDriver;

import SeleniumOne.BaseClass;

public class BrowserNavigation {

	public static void main(String[] args) throws InterruptedException {
		
	     WebDriver webdr = BaseClass.init("chrome", "http://www.google.ca");
	     Thread.sleep(2000);
	     webdr.navigate().refresh();
	     Thread.sleep(2000);
	     webdr.navigate().back();
	     Thread.sleep(2000);
	     webdr.navigate().forward();
	     Thread.sleep(3000);
	     //System.out.println(webdr.getPageSource());
	     String str = webdr.getPageSource();
	     String[] sp = str.split("href=");
	     int i=0;
	     /*for(String s:sp) {
		     System.out.println("["+i+"]:"+s);
		     i++;
	     }*/
	     String str1 = sp[43].substring(1, 27);
	     System.out.println(str1);

	     webdr.navigate().to("http://www.facebook.com");
	}

}
