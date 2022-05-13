package week4.day2.classroom;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlertsAndFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
//driver.switchTo().frame("iframeResult");
//WebElement frame = driver.findElement(By.id("iframeResult"));
//driver.switchTo().frame(frame);
driver.switchTo().frame(0);
driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
Alert alert = driver.switchTo().alert();
alert.sendKeys("lakshmi");
alert.accept();
System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());

	}

}
