package com.chiselon.classfieds.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\chiselon\\workspace\\Classfields\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		
driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
Actions a=new Actions(driver);
a.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']"))).build().perform();
Thread.sleep(2000);
a.moveToElement(driver.findElement(By.xpath("//span[text()='Apple']"))).click().build().perform();

		
		
	}

}
