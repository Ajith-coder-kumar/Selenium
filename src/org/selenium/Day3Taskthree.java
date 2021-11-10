package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Taskthree {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium class notes\\chromedriver_win32\\chromedriver.exe");
		
		//launch browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstname.sendKeys("Ajith");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastname.sendKeys("Kumar");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
		address.sendKeys("E/4F, TNHB flats, anna nagar west, chennai-30 ");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("kumarajith92.ak@gmail.com");
		
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("8438329101");
		
		WebElement gender = driver.findElement(By.xpath("//input[@value='Male']"));
		gender.click();
		
		WebElement checkbox = driver.findElement(By.id("checkbox2"));
		checkbox.click();
		
		WebElement firstpasswrd = driver.findElement(By.id("firstpassword"));
		firstpasswrd.sendKeys("Ajith@12");
		
		WebElement secondpasswrd = driver.findElement(By.id("secondpassword"));
		secondpasswrd.sendKeys("Ajith@12");
	}
}
