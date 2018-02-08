package com.chiselon.classfieds.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Classfieds_tittles {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/colour/my_items.php");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//td[@id='login']/a")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("abc@abc.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		//driver.findElement(By.xpath("(//td[@align='left']/a)[3]")).click();
		 List<WebElement> d = driver.findElements(By.xpath("//td[@align='left']/a"));
			int s = d.size();
		for(int i=0;i<s;i++){
			String a = d.get(i).getText();
			System.out.println(a);
		
		}
		
	}

}
