package SeeleniumFeatures;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class CookiesAndCertificateFireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Browser Profiles
		FirefoxProfile br = new FirefoxProfile();
		
		br.setAcceptUntrustedCertificates(false);
		br.setEnableNativeEvents(true);
	
		WebDriver dr = new FirefoxDriver(br);
	
		dr.get("http://www.facebook.com");
		
		//Cookies manage
		//dr.manage().deleteAllCookies();
	    /*String name=null;
		Set<Cookie> str = dr.manage().getCookies();
		for(Cookie s:str){
		System.out.println(s.getName());
		name=s.getName();}
		
		
		dr.manage().deleteCookieNamed(name);
		
		Set<Cookie> str1 = dr.manage().getCookies();
		for(Cookie s:str1)
		System.out.println(s);*/

		//Certificates
		
	}

}
