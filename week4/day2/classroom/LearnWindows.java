package week4.day2.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.findElement(By.id("home")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listwindows=new ArrayList<String>(windowHandles);
		String newwin=listwindows.get(1);
		driver.switchTo().window(newwin);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(listwindows.get(0));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}

}