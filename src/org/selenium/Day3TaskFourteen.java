package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3TaskFourteen {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\selenium class notes\\chromedriver_win32\\chromedriver.exe");
		
		//launch browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		
		WebElement btnsignup = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		btnsignup.click();
		
		WebElement mobile = driver.findElement(By.id("mobile"));
		mobile.sendKeys("8438329101");
		
		WebElement name = driver.findElement(By.xpath("//input[@tabindex='2']"));
		name.sendKeys("AjithKumar");
		
		WebElement email = driver.findElement(By.xpath("//input[@tabindex='3']"));
		email.sendKeys("kumarajith92.ak@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@tabindex='4']"));
		password.sendKeys("Ajith@120");
		
		WebElement btncontinue = driver.findElement(By.xpath("//a[@class='a-ayg']"));
		btncontinue.click();
	}

}
