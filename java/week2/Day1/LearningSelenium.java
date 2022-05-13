package week2.Day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearningSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./src/main/resources/drivers/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
//driver.close();
	}

}
