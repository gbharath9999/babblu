package com.chiselon.classfieds.assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","E:\\chiselon\\workspace\\Classfields\\drivers\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.naukri.com/"); 
		 driver.manage().window().maximize();
		 //getting all windows in one object = windows
			Set<String> allwindows = driver.getWindowHandles();
			System.out.println(allwindows.size());
			String mainWindow = driver.getWindowHandle();
			System.out.println("main window---->"+mainWindow);
			//driver.it();
			for (String handles :driver.getWindowHandles()) {
			if(mainWindow!=handles){
				driver.switchTo().window(handles);
				System.out.println("tittles----"+driver.getTitle());
				String titles = driver.getTitle();
				if(titles.trim().contains("Amazon")){
					driver.switchTo().window(handles);
					driver.manage().window().maximize();
					driver.findElement(By.xpath("(//img)[1]")).click();
					//driver.close();
					
				}
			}
				
			}
			
			

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

	}

}
