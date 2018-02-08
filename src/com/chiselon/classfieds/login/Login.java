package com.chiselon.classfieds.login;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Login {
	
	
	
	static WebDriver driver;
	static Properties pro;
	static FileInputStream file;
	static void properties() throws Exception{
		 file=new FileInputStream("E:\\chiselon\\workspace\\Classfields\\src\\com\\chiselon\\module\\properties\\classfieds.properties");
		pro=new Properties();
		pro.load(file);
		
	}
	static void broswer(){
		
		driver=new FirefoxDriver();
		driver.get(pro.getProperty("classfieds_url"));
		
	}
	/*static void  classfieldlogin(){
		try{
		properties();
		WebDriver driver = broswer();
		driver.findElement(By.xpath(pro.getProperty("classfieds_login"))).click();
		driver.findElement(By.xpath(pro.getProperty("classfieds_username"))).sendKeys("abc@abc.com");
		driver.findElement(By.xpath(pro.getProperty("classfieds_login_password"))).sendKeys("123456");
		driver.findElement(By.xpath(pro.getProperty("classfieds_login_button"))).click();
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}*/static void  classfieldLogin() throws Exception{
		String PASSWORD ="abc@abc.com";
		properties();
		broswer();
		
		driver.findElement(By.xpath(pro.getProperty("classfieds_login"))).click();
		driver.findElement(By.xpath(pro.getProperty("classfieds_username"))).sendKeys(LoginConstants.CONFORM_PASSWORD);
		driver.findElement(By.xpath(pro.getProperty("classfieds_login_password"))).sendKeys("123456");
		driver.findElement(By.xpath(pro.getProperty("classfieds_login_button"))).click();
		
	}
	
	
	
	public static void main(String[] args) throws Exception {
		classfieldLogin();	
		driver.close();
	}

}
