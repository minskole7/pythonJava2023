package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/IFrame/index.html");
		driver.manage().window().maximize();
		
		// by index
		//driver.switchTo().frame(0);
		
		//byNameorId
		//driver.switchTo().frame("frame");
	    
		
		//by Element 
		
		WebElement ele = driver.findElement(By.id("frame"));
		driver.switchTo().frame(ele);
		
		
		boolean elementdisplayed = driver.findElement(By.cssSelector("a[href=\"index.html\"]")).isDisplayed();
		if(elementdisplayed) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().defaultContent();
	
	}

}
