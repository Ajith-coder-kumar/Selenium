package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3TaskSeven {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\selenium class notes\\chromedriver_win32\\chromedriver.exe");
		
		//launch browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/trains");
		
		WebElement from = driver.findElement(By.id("from_station"));
		from.sendKeys("chennai");
		
		WebElement to = driver.findElement(By.id("to_station"));
		to.sendKeys("Egmore");
		
		WebElement btnsearchtrain  = driver.findElement(By.id("trainFormButton"));
		btnsearchtrain.click();
	}

}
