package week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassroomXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[1]")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		// click create lead link
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Lakshmi");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Priya");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
	} 

}
