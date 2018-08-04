package SeeleniumFeatures;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import SeleniumOne.BaseClass;

public class CaptureScreenShot extends BaseClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver d;
		Date dt = new Date();
		System.out.println(dt);
		SimpleDateFormat sm= new SimpleDateFormat("yyyy-MM-dd_");
		System.out.println(sm.format(dt));
		d=init("chrome", "http://www.google.com");
		File destFile=new File("captrueScree2_"+sm.format(dt)+".jpg");
		File f=((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, destFile);
		
		
	}
	

}
