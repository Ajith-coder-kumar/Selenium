package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3TaskEleven {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\selenium class notes\\chromedriver_win32\\chromedriver.exe");
		
		//launch browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		WebElement firstname  = driver.findElement(By.id("firstName"));
		firstname.sendKeys("Ajith");
		
		WebElement lastname  = driver.findElement(By.id("lastName"));
		lastname.sendKeys("Kumar");
		
		WebElement username  = driver.findElement(By.id("username"));
		username.sendKeys("kumarajith92.ak");
		
		WebElement password = driver.findElement(By.name("Passwd"));
		password.sendKeys("Ajith@120");
		
		WebElement confirmpassword = driver.findElement(By.name("ConfirmPasswd"));
		confirmpassword.sendKeys("Ajith@120");
		
		WebElement showpasswrd = driver.findElement(By.id("i3"));
		showpasswrd.click();
		
		WebElement btnnext = driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]"));
		btnnext.click();
	}

}
