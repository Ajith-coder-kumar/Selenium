package org.dropdown;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1Multi {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium class notes\\chromedriver_win32\\chromedriver.exe");

		// launch browser
		WebDriver driver = new ChromeDriver();

		// Open demo guru99 drag and drop
		driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
		driver.manage().window().maximize();
		
		WebElement options = driver.findElement(By.xpath("//select[@name='coffee2']"));
		Select multi =  new Select(options);
		List<WebElement> list = multi.getOptions();
		
		/*WebElement dairy = driver.findElement(By.xpath("//select[@label='Dairy']"));
		Select multidairy = new Select(dairy);
		List<WebElement> list2 = multidairy.getOptions();*/
		
		for (int i = 0; i < list.size(); i++) {
		WebElement a = list.get(i);
		String text = a.getText();
		System.out.println(text);
			}
		
		
		
		}
		
		
	}

