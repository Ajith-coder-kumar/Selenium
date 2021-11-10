package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium class notes\\chromedriver_win32\\chromedriver.exe");

		// launch browser
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
		driver.manage().window().maximize();
		WebElement multi = driver.findElement(By.xpath("//select[@name='coffee2']"));
		
		
		Select s = new Select(multi);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			if(i%2==1) {
				WebElement a = options.get(i);
				String text = a.getText();
				System.out.println(text);
			}
		}
		System.out.println('\n');
		Thread.sleep(2000);
		
		for (int i = 0; i < options.size(); i++) {
			if(i%2==0) {
				WebElement a = options.get(i);
				String text = a.getText();
				System.out.println(text);
				System.out.println("Checkout");
			}	
		}
	}
}
	
