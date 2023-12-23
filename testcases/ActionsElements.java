package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
		
		// Test case -1 -  dblclick
//		WebElement ele = driver.findElement(By.cssSelector("#double-click"));
//		
//		Actions action = new Actions(driver);
//		action.doubleClick(ele).build().perform();
//		
//		String className = driver.findElement(By.cssSelector("#double-click")).getAttribute("class");
//		if(className.equals("div-double-click double")) {
//			System.out.println("Test case pass");
//		}
//		else {
//			System.out.println("Test case fail");
//		}
//		
//		driver.quit();
//		
		
		// Test case 2 - click and hold 
//		WebElement ele = driver.findElement(By.cssSelector("#click-box"));
//		Actions action = new Actions(driver);
//		action.clickAndHold(ele).build().perform();
//		String actualText = driver.findElement(By.cssSelector("#click-box")).getText();
//		if(actualText.contains("Well done! keep holding that click now.....")) {
//			System.out.println("Test case pass");
//		}
//		else {
//			System.out.println("Test case fail");
//		}
//			
		
		// TestCase 3
		
//		WebElement moveE = driver.findElement(By.cssSelector("#div-hover > div.dropdown.hover > button"));
//		Actions action = new Actions(driver);
//		action.moveToElement(moveE).build().perform();
//		boolean  avail = driver.findElement(By.cssSelector("#div-hover > div.dropdown.hover > div > a")).isDisplayed();
//		if(avail) {
//			System.out.println("Test case pass");
//		}
//		
//		else {
//			System.out.println("Test case fail");
//		}
		
		
		// Testcase 4
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"))	;
		Actions action = new Actions(driver);
		
		action.dragAndDrop(draggable, droppable).build().perform();
		String actual = driver.findElement(By.id("droppable")).getText();
		if(actual.equals("Dropped!")) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
