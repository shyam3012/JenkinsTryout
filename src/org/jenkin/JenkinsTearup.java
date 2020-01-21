package org.jenkin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JenkinsTearup {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shyam Sundar U V\\workspace\\JenkinsTryout\\driver\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.facebook.com/");
	d.findElement(By.id("email")).sendKeys("shyam");
	d.findElement(By.id("pass")).sendKeys("12345");
	d.findElement(By.id("loginbutton")).click();
	
}
}
