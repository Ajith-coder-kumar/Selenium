package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3TaskEight {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\selenium class notes\\chromedriver_win32\\chromedriver.exe");
		
		//launch browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstech.in/selenium-course-content.html");
		
		WebElement modelresume = driver.findElement(By.id("heading201"));
		modelresume.click();
		
		WebElement model1  = driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/Fresher_Selenium_Resume.pdf']"));
		model1.click();
	}

}
