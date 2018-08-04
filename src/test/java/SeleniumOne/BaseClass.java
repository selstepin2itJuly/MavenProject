package SeleniumOne;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseClass {

	private static WebDriver driver;
	private static String url="http://www.facebook.com";
	
	/*public BaseClass(WebDriver driver) {
		this.driver=driver;
	}*/
	public static WebDriver init(String str, String url) {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platform",Platform.WIN10);
		if(str.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\fakhr\\Downloads\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver(cap);
			
		}else if(str.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.firefox.driver", "");
			driver= new FirefoxDriver();
		}else {
			System.out.println("browser not defined");
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	
	
}
