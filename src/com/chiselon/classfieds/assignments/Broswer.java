package com.chiselon.classfieds.assignments;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Broswer {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number 1=chrome, 2=firefox , 3=Internet Exploser");
		int EnterVaue = scanner.nextInt();
		if(EnterVaue==1){
			System.setProperty("webdriver.chrome.driver","E:\\chiselon\\workspace\\Classfields\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://localhost/colour/");
		}
		else if(EnterVaue==2){
			WebDriver driver=new FirefoxDriver();
			driver.get("http://localhost/colour/");
			
		}
		else if(EnterVaue==3){
			System.setProperty("webdriver.ie.driver","E:\\chiselon\\workspace\\Classfields\\drivers\\IEDriverServer.exe");

			WebDriver driver = new InternetExplorerDriver();

			driver.get("https://www.google.com");
			
		}
		else{
			System.out.println("please enter the vaid value 1/2/3");
		}
		

	
		
	}

}
 