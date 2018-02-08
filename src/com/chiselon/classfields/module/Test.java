package com.chiselon.classfields.module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\chiselon\\software\\chromedriver.exe");
		
//	WebDriver driver=new FirefoxDriver();
//	driver.get("https://www.facebook.com/");
	
	ChromeDriver driver1=new ChromeDriver();
	driver1.get("https://www.gmail.com/");
	driver1.manage().window().maximize();
	
	String url=driver1.getCurrentUrl();
	String Ex="wwww.fb.com"; 
	/*if(Ex.equals(url))
	{
		System.out.println("Test passed");
	}*/
	if(url.contains(".com"))
	{
		System.out.println("Test passed");
	}
	else{
		System.out.println("Test failed");
	}
	driver1.close();
	

	}

}
