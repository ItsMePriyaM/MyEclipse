package week3.classroom;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSFNames {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();         
		ChromeDriver driver = new ChromeDriver(); // Open a new chrome browser       
		driver.manage().window().maximize(); // Maximize the opened chrome browser window         
		driver.get("https://erail.in/"); // Loads the URL in the opened browser        
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //for webdriver too same     
		WebElement from = driver.findElement(By.id("txtStationFrom"));         
		from.clear();         
		from.sendKeys("TPJ", Keys.TAB);        
		WebElement to = driver.findElement(By.id("txtStationTo"));        
		to.clear();         to.sendKeys("MDU", Keys.TAB);         
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		//WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']"));
		
		List<WebElement> trainnames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr/td[2]"));
		for(int i=0;i<trainnames.size();i++)
		{
		String names=trainnames.get(i).getText();
		if(names.contains("SF"))
		{
			System.out.println(trainnames.get(i).getText());
		}
			
			
		
		}
		
	}

}
