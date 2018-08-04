package SeeleniumFeatures;
import org.apache.http.cookie.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import SeleniumOne.BaseClass;

public class CookiesAndCertificates {

	public static void main(String[] args) {
		
		WebDriver dr = BaseClass.init("chrome", "http://www.facebook.com");
        //dr.manage().deleteAllCookies();		
		/*System.out.println(dr.manage().getCookies());
		Cookie arg=(Cookie) dr.manage().getCookies();
		System.out.println(arg.getVersion());*/
		
		ChromeOptions c= new ChromeOptions();
		
		
		

	}

}
