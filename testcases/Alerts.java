package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// program 1
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		WebElement alertJs = driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button"));
//		alertJs.click();
//		String alertText = driver.switchTo().alert().getText();
//		driver.switchTo().alert().accept();
//		WebElement ele = driver.findElement(By.id("result"));
//		String alertTexte = ele.getText();
//		
//		if(alertText.equals("I am a JS Alert") && alertTexte.equals("You successfully clicked an alert")) {
//			System.out.println("Test case pass");
//		}
//		else {
//			System.out.println("Test case fail");
//		}
//		
//		driver.close();
		
		// program2

		// Arrangement 
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
//		ChromeDriver driver2 = new ChromeDriver();
//		driver2.get("https://the-internet.herokuapp.com/javascript_alerts");
//		
//		//Actions
//		WebElement confirmAlert = driver2.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
//		confirmAlert.click();
//		String confirmLAertText = driver2.switchTo().alert().getText();
//		driver.switchTo().alert().accept();
//		String domE = driver2.findElement(By.id("result")).getText();
//		
//		//Assertions
//		
//		if(confirmLAertText.equals("I am a JS Confirm") && domE.equals("You clicked: Ok")) {
//			System.out.println("Test case pass");
//		}
//		else {
//			System.out.println("Test case fail");
//		}
//		
//		driver2.close();
//		
		
		// Program 3
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
//		ChromeDriver driver3 = new ChromeDriver();
//		driver3.get("https://the-internet.herokuapp.com/javascript_alerts");
//		
//		//Actions
//		WebElement confirmAlert = driver3.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
//		confirmAlert.click();
//		String confirmLAertText = driver3.switchTo().alert().getText();
//		driver.switchTo().alert().dismiss();
//		String domE = driver3.findElement(By.id("result")).getText();
//		
//		//Assertions
//		
//		if(confirmLAertText.equals("I am a JS Confirm") && domE.equals("You clicked: Cancel")) {
//			System.out.println("Test case pass");
//		}
//		else {
//			System.out.println("Test case fail");
//		}
//		
//		driver3.close();
		
		
		
		// Test case 4:- 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver4 = new ChromeDriver();
		driver4.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver4.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
		String promptText = driver4.switchTo().alert().getText();
		driver4.switchTo().alert().sendKeys("chinmay");
		driver4.switchTo().alert().accept();
		String dom2Text = driver4.findElement(By.id("result")).getText();
		
		if(promptText.equals("I am a JS prompt") && dom2Text.equals("You entered: chinmay")) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		driver4.close();
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver5 = new ChromeDriver();
		driver5.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver5.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
		String promptText2 = driver5.switchTo().alert().getText();
		driver5.switchTo().alert().sendKeys("chinmay");
		driver5.switchTo().alert().dismiss();
		String dom2Text2 = driver5.findElement(By.id("result")).getText();
		
		if(promptText2.equals("I am a JS prompt") && dom2Text2.equals("You entered: null")) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		
		driver5.close();
		
		
		// windowHandles()
		// iframe()
		// shandowDom()
		

	}

}
