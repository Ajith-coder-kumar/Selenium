package org.accessspecifier;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get(null);
	}

}
