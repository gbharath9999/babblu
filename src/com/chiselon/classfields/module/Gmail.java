package com.chiselon.classfields.module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Gmail 
{

	
	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver","E:\\chiselon\\workspace\\Classfields\\drivers\\chromedriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp?hl=en");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("bharath");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("kumar");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/form/div[2]/label/input")).sendKeys("babblu5550@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("123+456+789");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("123+456+789");
		driver.findElement(By.xpath("(//span[@id='BirthMonth']/div)[1]")).sendKeys("September");
		driver.findElement(By.xpath("//input[@id='BirthDay']")).sendKeys("28");
		driver.findElement(By.xpath("//input[@id='BirthYear']")).sendKeys("1992");
		driver.findElement(By.xpath("(//div[@id='Gender']/div)[1]")).sendKeys("Male");
		driver.findElement(By.xpath("//input[@name='RecoveryPhoneNumber']")).sendKeys("9000002095");
		//driver.findElement(By.xpath("//div[text()='India (भारत)']")).click();
		Select s=new Select(driver.findElement(By.xpath("//div[text()='India (भारत)']")));
		s.selectByVisibleText("India (भारत)");
		
		
		Thread.sleep(5000);
		driver.close();
		
		
		
		
	}

}
