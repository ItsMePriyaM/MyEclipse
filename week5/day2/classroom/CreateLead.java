package week5.day2.classroom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {
	@Test(dataProvider="dataMethod")
	public  void createlead(String cname,String name,String lname) {
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(name);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.name("submitButton")).click();
		
	
	
}
	@DataProvider
	public String[][] dataMethod()
	{
		String[][] data=new String[2][3];
		
		data[0][0]="Infosys";
		data[0][1]="Priya";
		data[0][2]="R";
		
		data[1][0]="HCL";
		data[1][1]="Vinoth";
		data[1][2]="J";
		
		return data;
	}
}


