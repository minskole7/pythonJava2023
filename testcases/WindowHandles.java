package testcases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com");
		String homePageId = driver.getWindowHandle();
		System.out.println(homePageId);
		
		driver.findElement(By.id("contact-us")).click();
		String homePageId2 = driver.getWindowHandle();
		System.out.println(homePageId2);
		
		
		Set <String> handles = driver.getWindowHandles();
		System.out.println(handles);
		for(String handle:handles) {
			
			if(!handle.equals(homePageId2)) {
				driver.switchTo().window(handle);
				break;
			}
		}
		
		System.out.println(driver.getWindowHandle());
		
		boolean firstValue = driver.findElement(By.name("contactme")).isDisplayed();
		if(firstValue) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		
		driver.close();
		
		
	}

}
