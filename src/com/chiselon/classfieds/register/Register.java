package com.chiselon.classfieds.register;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Register {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("E:\\chiselon\\workspace\\Classfields\\src\\com\\chiselon\\module\\properties\\classfieds.properties");
		Properties pro=new Properties();
		pro.load(file);
		//System.setProperty("webdriver.chrome.driver","E:\\chiselon\\software\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get(pro.getProperty("classfieds_url"));
		driver.findElement(By.xpath(pro.getProperty("classfieds_register"))).click();//register click 
		driver.findElement(By.xpath(pro.getProperty("classfieds_email"))).sendKeys("classfieds_email_data");//email id 
		driver.findElement(By.xpath(pro.getProperty("classfieds_fullname"))).sendKeys("classfieds_fullname_data");//full name
		driver.findElement(By.xpath(pro.getProperty("classfieds_password"))).sendKeys("classfieds_password_data");// password
		driver.findElement(By.xpath(pro.getProperty("classfieds_conform_password"))).sendKeys("classfieds_conform_password_data");//conform password
		driver.findElement(By.xpath(pro.getProperty("classfieds_agree_condtion"))).click();//agree condition
		driver.findElement(By.xpath(pro.getProperty("classfieds_register_button"))).click();//register button
		
		
		
		Thread.sleep(5000);// wait 5sec 
		driver.close();//close site
	}

}
