package com.chiselon.classfieds.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete_ {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\chiselon\\workspace\\Classfields\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/colour/my_items.php");
		driver.findElement(By.xpath("//td[@id='login']/a")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("abc@abc.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("(//td[@align='left']/a)[3]")).click();
		
			}
}


