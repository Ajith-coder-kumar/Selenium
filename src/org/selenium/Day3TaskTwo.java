package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3TaskTwo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium class notes\\chromedriver_win32\\chromedriver.exe");
		
		//launch browser
		WebDriver driver = new ChromeDriver();
		
		//Open Facebook login Page
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//Click user name text box
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("kumarajith92.ak@gmail.com");
		
		//Click password text box
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("");
		
		//Click Login Button
		WebElement btnlogin = driver.findElement(By.xpath("//button[@name='login']"));
		btnlogin.click();

	}

}
