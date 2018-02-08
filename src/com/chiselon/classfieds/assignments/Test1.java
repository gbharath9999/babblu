package com.chiselon.classfieds.assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
	
	
	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		String s="http://localhost/colour/";
		String s1="register.php";
		driver.get(s+s1);
		
	}

}
