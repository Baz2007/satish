package baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.firefox.*;

public class browserSetup extends declarations{
	

	public static WebDriver StartBrowser(String browsername, String url) throws InterruptedException {
		if (browsername.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
		}
		else if (browsername.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
		}
		else if (browsername.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			driver.manage().deleteAllCookies();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
	}
	}