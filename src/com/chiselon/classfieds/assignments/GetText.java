 package com.chiselon.classfieds.assignments;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetText {
	
	
	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/colour/my_items.php");
		driver.findElement(By.xpath("//td[@id='login']/a")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("abc@abc.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("(//td[@align='left']/a)[3]")).click();
		/*WebElement e=driver.findElement(By.xpath("(//img[@alt='Edit this ad'])[1]"));
		//e.getText();
		String b=e.getAttribute("alt");
		System.out.println(b);
		driver.close();*/
		List<WebElement> a = driver.findElements(By.xpath("(((((((//table[@class='box'])[1])/tbody/tr)[2])/td)[2])/a/img)"));
		Thread.sleep(2000);
		int b = a.size();
		
		for(int i = 0;i<b;i++)
		{
		  String c = a.get(i).getAttribute("alt");
		  System.out.println(c);
		}
		
	}

}
