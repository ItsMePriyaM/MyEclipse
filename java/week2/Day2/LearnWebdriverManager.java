package week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebdriverManager {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","./src/main/resources/drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//Steps to Learn Drop Down access
		
		driver.get("https://facebook.com");
        driver.findElement(By.partialLinkText("Create New Account")).click();
        Thread.sleep(2000);//2 secs
      //Step 1 : Identify the parent tag
        WebElement daydrop = driver.findElement(By.id("day"));
        
        //Step2 : Create a object for class
        Select S=new Select(daydrop);
        S.selectByVisibleText("26");
        
        //Select By value
        WebElement month = driver.findElement(By.id("month"));
        Select mm=new Select(month);
        mm.selectByValue("1");
        mm.selectByIndex(2);
        
        
		
		//driver.close();

	}

}
