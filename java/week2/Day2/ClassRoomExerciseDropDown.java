package week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassRoomExerciseDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("democsr");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.partialLinkText("CRM/SFA")).click();
driver.findElement(By.partialLinkText("Leads")).click();
driver.findElement(By.partialLinkText("Create Lead")).click();
//Drop Down
WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
Select ss=new Select(source);
ss.selectByVisibleText("Employee");

WebElement industry=driver.findElement(By.id("createLeadForm_industryEnumId"));
Select ii=new Select(industry);
ii.selectByValue("IND_FINANCE");

WebElement owner=driver.findElement(By.name("ownershipEnumId"));
Select oo=new Select(owner);
oo.selectByIndex(2);

	}

}
