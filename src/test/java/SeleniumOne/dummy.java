package SeleniumOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dummy extends BaseClass {
	
	public static void main(String[] str) throws InterruptedException{
		
	    WebDriver driver = null;
		//BaseClass b= new BaseClass();
		String url="";
		driver=init("chrome",url);
		Thread.sleep(2000);
	
	}

	

}
