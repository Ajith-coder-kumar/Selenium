package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3TaskThirteen {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\selenium class notes\\chromedriver_win32\\chromedriver.exe");
		
		//launch browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		
		WebElement mobile = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
		mobile.sendKeys("8438329101");
		
		WebElement btnsubmit = driver.findElement(By.className("submitBottomOption"));
		btnsubmit.click();
	}
}
