package org.seleniumday5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5Task1 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\selenium class notes\\chromedriver_win32\\chromedriver.exe");
		
		//launch browser
		WebDriver driver = new ChromeDriver();
		
		//Open demo guru99 drag and drop
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement s = driver.findElement(By.id("credit2"));
		WebElement d = driver.findElement(By.id("bank"));
		
		WebElement s1 = driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
		WebElement d1 = driver.findElement(By.id("amt7"));
		
		WebElement s2 = driver.findElement(By.id("credit1"));
		WebElement d2 = driver.findElement(By.id("loan"));
		
		WebElement s3 = driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
		WebElement d3 = driver.findElement(By.id("amt8"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(s, d).perform();
		actions.dragAndDrop(s1, d1).perform();
		actions.dragAndDrop(s2, d2).perform();
		actions.dragAndDrop(s3, d3).perform();
			
		
		
	}

}
