package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3TaskTwelve {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\selenium class notes\\chromedriver_win32\\chromedriver.exe");
		
		//launch browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		
		WebElement btnsignin = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		btnsignin.click();
		
		WebElement btnlogin = driver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']"));
		btnlogin.click();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='userName']"));
		username.sendKeys("kumarajith92.ak@gmail.com");
		
		WebElement btncheckuser = driver.findElement(By.id("checkUser"));
		btncheckuser.click();
	}
}
