package week2.Day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookDropDowns {
	// Step 1: Download and set the path 
	// Step 2: Launch the chromebrowser
	// Step 3: Load the URL https://en-gb.facebook.com/
	// Step 4: Maximise the window
	// Step 5: Add implicit wait
	// Step 6: Click on Create New Account button
	// Step 7: Enter the first name
	// Step 8: Enter the last name
	// Step 9: Enter the mobile number
	// Step 10: Enterthe password
	// Step 11: Handle all the three drop downs
	// Step 12: Select the radio button "Female" 
	            

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.partialLinkText("Create New Account")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("lakshmi");
driver.findElement(By.xpath("//inpUt[@name='lastname']")).sendKeys("priya");
driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9323221323");

driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("password123");
driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
WebElement daydrop = driver.findElement(By.id("day"));

//Step2 : Create a object for class
Select S=new Select(daydrop);
S.selectByVisibleText("26");

//Select By value
WebElement month = driver.findElement(By.id("month"));
Select mm=new Select(month);
mm.selectByValue("1");


WebElement year = driver.findElement(By.id("year"));
Select yy=new Select(year);
yy.selectByValue("1992");

	}

}
