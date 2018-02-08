package com.chiselon.classfields.module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedBus {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chiselon\\workspace\\Classfields\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/?gclid=EAIaIQobChMIt6bK1aiY2AIVkCQrCh0E8Q8FEAAYASAAEgI-kfD_BwE");
		driver.manage().window().maximize();
driver.findElement(By.xpath("//i[@class='icon-profile-new-unsigned ']")).click();
//Thread.sleep(5000);
driver.findElement(By.xpath("//li[text()='Sign In/Sign Up']")).click();
Thread.sleep(5000);
driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='modalContent']/iframe")));
driver.findElement(By.xpath("(//a[@class='signin-screen'][text()='sign in'])[1]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@placeholder='Enter your email id or mobile number']")).sendKeys("cr7");
driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("cr7cr7");
	driver.findElement(By.xpath("//label[@class='remember-checkbox']")).click();
	driver.findElement(By.xpath("//button[@id='doSignin']")).click();
	String invalid = driver.findElement(By.xpath("//span[text()='not a valid email id or phone number']")).getText();
	System.out.println(invalid);
	driver.close();
	//driver.findElement(By.xpath("//i[@class='icon-close']")).click();
	}

}
