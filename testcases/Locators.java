package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.util.internal.SystemPropertyUtil;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		// finding the single element
		boolean avail = driver.findElement(By.cssSelector("h2[name= \"contactme\"]")).isDisplayed();
		if(avail) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		
		// finding the multiple elements 
		
		int elements = driver.findElements(By.cssSelector("input[type=\"text\"]")).size();
		if(elements == 3) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		
		// className 
		
		int elements2 = driver.findElements(By.className("feedback-input")).size();
		if(elements2 == 4) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		
		// id 
			
		boolean avail2  = driver.findElement(By.id("contact_form")).isDisplayed();
		if(avail2) {
			System.out.println("Testcase pass");
		}
		else {
			System.out.println("Test case fail");
		}
		
		
		// tagName 
		
		boolean avail3 = driver.findElement(By.tagName("h2")).isDisplayed();
		if(avail3) {
			System.out.println("Testcase pass");
		}
		else {
			System.out.println("Test case fail");
		}
		
		
		// name 
		
		boolean avail4 = driver.findElement(By.name("first_name")).isDisplayed();
		if(avail4) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		
		
		// Xpath
		
		boolean avail5 = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]")).isDisplayed();
		if(avail5) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		
		// Link Text 
		
		
		// Partial lInked
		
		
		
		
	}

}
