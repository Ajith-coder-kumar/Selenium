package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3TaskFive {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\selenium class notes\\chromedriver_win32\\chromedriver.exe");
		
		//launch browser
		WebDriver driver = new ChromeDriver();
		
		//Open Greens Technology Selenium Web Page
		driver.get("http://www.greenstech.in/selenium-course-content.html");
		
		//Click Interview Questions
		WebElement btninterview = driver.findElement(By.id("heading20"));
		btninterview.click();
		
		//Click Cts Interview Questions
		WebElement btncts = driver.findElement(By.xpath("//a[@href='http://greenstech.in/interview-questions/cts.pdf#toolbar=0']"));
		btncts.click();
	}

}
