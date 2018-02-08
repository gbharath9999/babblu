package com.chiselon.classfieds.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jobs {

	static String s="Jobs (1)";
	static String s1="Medical Transcription (1)";
	public static void main(String[] args) {
		//try{
		System.setProperty("webdriver.chrome.driver", "E:\\chiselon\\workspace\\Classfields\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://localhost/colour/index.php?catid=80");
		driver.get("http://localhost/colour/");
		List<WebElement> elements = driver.findElements(By.xpath("((//td[@class='category'])/a)"));
		System.out.println(elements.size());
		int size = elements.size();
		String gettext = null;
		for(int i=1;i<size;i++){
			// gettext = elements.get(i).getText();
			WebElement element1 = driver.findElement(By.xpath("((//td[@class='category'])/a)["+i+"]"));
			String located = element1.getText();
			System.out.println(located);
			
			if(located.trim().equalsIgnoreCase(s)){
				driver.findElement(By.xpath("((//td[@class='category'])/a)["+i+"]")).click();
				
				System.out.println(located+"---clicked");
			
				List<WebElement> elements1 = driver.findElements(By.xpath("((//td[@class='category'])/a)"));
				int size1 = elements1.size();
				// driver.findElement(By.xpath("((//td[@class='category'])/a)"))
				
				for(int j=1;j<size1;j++){
					//String gettext1 = elements1.get(j).getText();
					
					WebElement element2 = driver.findElement(By.xpath("((//td[@class='category'])/a)["+j+"]"));
					
					String located1 = element2.getText();
					System.out.println(located1);
					
					if(located1.trim().equalsIgnoreCase(s1)){
						driver.findElement(By.xpath("((//td[@class='category'])/a)["+j+"]")).click();
						System.out.println(located1+"---clicked");
						
						
						WebElement element3 = driver.findElement(By.xpath("(//td[@class='category'])/.."));
						System.out.println(element3.getText());
						break;
					}
					
					
				}
				break;

			}
			}
	
	/*catch(Exception e){
		e.getMessage();
		e.printStackTrace();
	*/	
	
	
	}
}