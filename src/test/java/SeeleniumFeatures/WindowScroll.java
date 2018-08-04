package SeeleniumFeatures;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.Reader;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import SeleniumOne.BaseClass;

public class WindowScroll extends BaseClass{
	
	static WebDriver driver;
	public static void methodOne() {
		System.out.println("Method One");
		int[] a= {1,2,4,5};
		try {
		a[4]=10;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void methodTwo() {
		System.out.println("Method Two");
		try {
		   int a = 100/0;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void methodThree() {
		System.out.println("Method three");
		
	}
	public static void methodfour() {
		System.out.println("Method Four");
		//driver=null;
		String str="5";
		Properties p = null;
		try {
		//driver.findElement(By.xpath("//*[@value='Male']"));
			//int a=100/0;
			File f= new File("C:\\Users\\fakhr\\eclipse-workspace\\JavaSessionJuly2018\\src\\one.properties");
			p = new Properties();
			FileInputStream fileInput = new FileInputStream(f);
			FileOutputStream fileOutput = new FileOutputStream(f);
			
			BufferedInputStream fileInputbuffe = new BufferedInputStream(fileInput);
		
			p.load(fileInput);
			//p.load();
			
		}catch(Exception e) {
			System.out.println("Catch");
		}
		finally {
		 System.out.println("Finally");	
		 str = p.getProperty("one");
			
			System.out.println("Try: "+str);
		}
	}
	public static void methodFive() {
		System.out.println("Method Five");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String url="http://www.google.com";
		//String url="http://toolsqa.com/automation-practice-form/";
		driver=init("chrome",url);
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("window.scroll(0,900)", "");
		Thread.sleep(2000);
		//je.executeScript("window.scroll(900,0)", "");
		je.executeScript("window.scroll(0,-900)", "");
		
		WindowScroll sc = new WindowScroll();
		sc.methodOne();
		sc.methodTwo();
		sc.methodThree();
		sc.methodfour();
		sc.methodFive();
		
		
	}

}
