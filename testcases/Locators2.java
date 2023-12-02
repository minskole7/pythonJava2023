package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {
	
	
	// Locators 
	
	// by ClassName 
	// by Name 
	// by LinkText
	// by Partial LinkText
	// by id 
	// by tagName 
	// by Css selector 
	// by xPath

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/");
		WebElement elementByLinktext = driver.findElement(By.linkText("Cypress with Cucumber BDD - Beginner to Expert in 9 Hours!"));
		if(elementByLinktext.isDisplayed()) {
			System.out.println("Testcase pass");
		}
		else {
			System.out.println("Testcase fail");
		}
		
		WebElement elementByPLinktext = driver.findElement(By.partialLinkText("Cypress with Cucumber BDD"));
		if(elementByPLinktext.isDisplayed()) {
			System.out.println("Testcase2 pass");
		}
		else {
			System.out.println("Testcase2 fail");
		}

		
		
	}

}
