package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3TaskTen {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\selenium class notes\\chromedriver_win32\\chromedriver.exe");
		
		//launch browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement product = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		product.click();
		
		WebElement books = driver.findElement(By.xpath("//option[@value='search-alias=stripbooks']"));
		books.click();
		
		WebElement search = driver.findElement(By.id("nav-search-submit-button"));
		search.click();
	}

}
