package org.javatask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\selenium class notes\\chromedriver_win32\\chromedriver.exe");
		
		//launch browser
		WebDriver driver = new ChromeDriver();
		
		//Open demo guru99 drag and drop
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement btnclose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnclose.click();
		
		WebElement txtsearch = driver.findElement(By.xpath("//input[@name='q']"));
		txtsearch.sendKeys("i phone");
	
		WebElement btnsearch = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		btnsearch.click();
		Thread.sleep(3000);
		
		 List<WebElement> list = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		 List<WebElement> list1  = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		 
		 Map<String, Integer> li = new TreeMap<String, Integer>();
		 
		 Set<Entry<String, Integer>> entrySet = li.entrySet();
		 for (WebElement entry : list1) {
		}
	
	 for (int i = 0; i < list.size(); i++) {
		 WebElement price = list.get(i);
		 String text = price.getText();
		 System.out.println(text);
	}
	 
	 for (int i = 0; i < list1.size(); i++) {
		WebElement apple = list1.get(i);
		String text1 = apple.getText();
		System.out.println(text1);
	}
	 
	
	 
	 
	}

}
