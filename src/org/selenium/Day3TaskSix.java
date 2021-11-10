package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3TaskSix {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\selenium class notes\\chromedriver_win32\\chromedriver.exe");
		
		//launch browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		//driver.manage().window().maximize();
		//without maximizing window signin down element click is intercepted
		
		WebElement btnsignin  = driver.findElement(By.id("sign-in-icon-down"));
		btnsignin.click();
		
		WebElement btnsigninlink = driver.findElement(By.xpath("//li[@id='signInLink']"));
		btnsigninlink.click();
		
		//after window maximized
		//error unable to locate element
		WebElement mobile = driver.findElement(By.id("mobileNoInp"));
		mobile.sendKeys("8438329101");
		
		WebElement btngenerate = driver.findElement(By.id("otp-container"));
		btngenerate.click();
		
		
	}

}
