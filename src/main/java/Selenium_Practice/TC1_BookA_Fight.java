package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC1_BookA_Fight {

	public static void main(String[] args) throws InterruptedException {
		 
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.phptravels.net/home";
		driver.navigate().to(url);
		
		Thread.sleep(2000);
		
		//Print out the url
		System.out.println(url);
		
		Thread.sleep(3000);
		
		//Verify the the title of the page
		String pageTitle =  driver.getTitle();
		System.out.println(pageTitle);
		
		if(pageTitle.equals("PHPTRAVELS | Travel Technology Partner")){
			System.out.println("Page Title is correct");
		}else{
			System.out.println("Page Title is worng");
		}
		
		Thread.sleep(2000);
		
		//Click on Flight button
		driver.findElement(By.xpath("//a[@class='text-center flights ']")).click();
		
		Thread.sleep(2000);
		
		//Book a flight from the site for any location
		
        driver.findElement(By.xpath("//div/div[1]/label[text()='One Way']")).click();
        
 
		WebElement searchBtn = driver.findElement(By.xpath("//form/div/div/div[3]/div[4]/button[@class='btn-primary btn btn-block']"));
		Actions action = new Actions(driver);
		
		action.moveToElement(searchBtn).click().build().perform();
		  
 		 
		driver.close();
		
			
		
		
		
		
		

	}

}
