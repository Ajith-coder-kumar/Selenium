package org.seleniumday5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5Task3 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\selenium class notes\\chromedriver_win32\\chromedriver.exe");
		
		//launch browser
		WebDriver driver = new ChromeDriver();
		
		//Open demo guru99 drag and drop
		driver.get("https://www.t-mobile.com/?src=spr&rdpage=%2F");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement btnclose = driver.findElement(By.xpath("//button[@class='tntOverlayCloseBtn']"));
		btnclose.click();
		
		WebElement btnphones = driver.findElement(By.xpath("//a[@class='nav__link ng-tns-c59-15']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(btnphones).perform();
		
		WebElement fivegphones = driver.findElement(By.xpath("(span[@class='ng-tns-c59-15 ng-star-inserted'])[2]"));
		fivegphones.click();
		
		WebElement textbottomlink = driver.findElement(By.id("digital-footer-bottom-link-bottom-9"));
		String bottomlink = textbottomlink.getText();
		System.out.println(bottomlink);
		
		
		
	}

}
