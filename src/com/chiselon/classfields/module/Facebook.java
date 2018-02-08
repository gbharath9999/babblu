package com.chiselon.classfields.module;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Facebook {
	public static void main(String[] args) throws Exception {
		FileInputStream file=new FileInputStream("E:\\chiselon\\workspace\\Classfields\\src\\com\\chiselon\\module\\properties\\config.properties");
		Properties pro=new Properties();
		pro.load(file);
		System.setProperty("webdriver.chrome.driver","E:\\chiselon\\software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		System.out.println(pro.getProperty("url"));
		
		driver.manage().window().maximize();
		driver.get(pro.getProperty("url"));
		driver.findElement(By.xpath(pro.getProperty("firstname_xpath"))).sendKeys("123zxcvbn");
		driver.findElement(By.xpath(pro.getProperty("lastname_xpath"))).sendKeys("123zxcvbn");
		driver.findElement(By.xpath(pro.getProperty("mobilenumber_xpath"))).sendKeys("123zxcvbn");
		driver.findElement(By.xpath(pro.getProperty("Newpassword_xpath"))).sendKeys(pro.getProperty("sendkey"));
		Select s=new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
		s.selectByVisibleText("6");
		Thread.sleep(5000);
		Select s1=new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
		s1.selectByVisibleText("Dec");
		Thread.sleep(5000);
		Select s2=new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
		s2.selectByVisibleText("1990");
		Thread.sleep(5000);
		driver.findElement(By.xpath(" //label[text()='Female']")).click();
		Select s4=new Select(null);
		s4.selectByVisibleText("1990");
		
	
	
	driver.close();
	
	}
	

}
