package com.chiselon.classfieds.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classfieds_flags {
	

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\chiselon\\workspace\\Classfields\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/colour/");
		List<WebElement> webelementList = driver.findElements(By.xpath("//p[@style='text-align:right;']/a/img"));
		//int size = webelementList.size();
		//System.out.println(size);
		
		if(!webelementList.isEmpty() ||webelementList.size()>0){
			for(WebElement webElement : webelementList){
				String flagname = webElement.getAttribute("alt");
				System.out.println(flagname);
			}
		}
		
		}
		
	

}
