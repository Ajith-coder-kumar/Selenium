package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3TaskFour {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\selenium class notes\\chromedriver_win32\\chromedriver.exe");
		
		//launch browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/selenium-training/#enroll-form");
		driver.manage().window().maximize();
		WebElement firstname = driver.findElement(By.id("first-name"));
		firstname.sendKeys("Ajith");
		
		WebElement lastname  = driver.findElement(By.id("last-name"));
		lastname.sendKeys("Kumar");
		
		WebElement email  = driver.findElement(By.id("email"));
		email.sendKeys("kumarajith92.ak@gmail.com");
		
		WebElement mobile  = driver.findElement(By.id("mobile"));
		mobile.sendKeys("8438329101");
		
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("chennai");
		
		WebElement message = driver.findElement(By.id("message"));
		message.sendKeys("I am a BE graduate and like to upgrade m"
				+ "y software testing skills, for that i need to learn Selenium tool."
				+ " So, that'll help me to get easily placed in reputed MNCs.");
		
		//Click Send Button
		WebElement btnsend = driver.findElement(By.xpath("//button[@class='btn btn-block btn-primary']"));
		btnsend.click();
	}
}
