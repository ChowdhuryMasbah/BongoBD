package BongoBd.SqaCodeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	@SuppressWarnings("deprecation")
	public WebDriver initialzeddriver() throws IOException {
		Properties prop=new Properties();
		FileInputStream fis= new FileInputStream("C:\\work from home\\BongoBD\\SqaCodeTest\\src\\main\\java\\Resource\\data.properties");

		prop.load(fis);
		String browserName= prop.getProperty("browser");
		String BaseUrl= prop.getProperty("Url");
		
		if(browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\work from home\\BongoBD\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			//chrome	
		}
		else if (browserName.equals("firefox")) {
			//firefox
		}
		else if (browserName.equals("edge")) {
			//edge
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
		
	}
	
}
