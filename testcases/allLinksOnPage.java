package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allLinksOnPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// Test Case 1
//		driver.get("https://webdriveruniversity.com/");
//
//		// total number of links 
//		// find all link text 
//		List <WebElement> ele = driver.findElements(By.cssSelector("a[href]"));
//		System.out.println(ele.size());
//		// find all links and print them
//		for(int i = 0 ; i < ele.size(); i++) {
//			System.out.println("Links are "+ ele.get(i).getAttribute("href"));
//			System.out.println("Links are "+ ele.get(i).getText());
//		}
//		if(ele.size() == 27) {
//			System.out.println("Test case pass");
//		}
//		else {
//			System.out.println("Test case fail");
//		}
//		
		// select drop down options
		// Test case 2
		
//		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
//		List<WebElement> optionss = driver.findElements(By.cssSelector("#dropdowm-menu-1 > option"));
//		System.out.println("Total options are"+optionss.size());
//		for(int i = 0 ; i < optionss.size() ; i++) {
//			System.out.println(optionss.get(i).getText());
//			
//		}
		
		// Test case 3 
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement  dropDownOne =driver.findElement(By.id("dropdowm-menu-1"));
		List<WebElement> optionsss = dropDownOne.findElements(By.tagName("option"));
		for(int i = 0 ; i < optionsss.size() ; i++) {
			System.out.println(optionsss.get(i).getText());
			
		}
		
		driver.close();
		

		
		
		
		
	}

}
