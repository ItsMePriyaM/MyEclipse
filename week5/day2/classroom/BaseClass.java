package week5.day2.classroom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	RemoteWebDriver driver;
	@Parameters({"url","uname","pwd","browser"})
	@BeforeMethod
	public void precondition(String url,String username,String password,String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@AfterMethod
	public void posttest()
	{
		driver.close();
	}

}
