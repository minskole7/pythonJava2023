package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Actions/index.html");
	
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"))	;
		Actions action = new Actions(driver);
		action.dragAndDrop(draggable, droppable).build().perform();
		String txt = driver.findElement(By.id("droppable")).getText();
		System.out.println(txt);
		if(txt.equals("Dropped!")) {
			System.out.println("Testcase pass");
		}
		else {
			System.out.println("Testcase fail");
		}
		String classVal = driver.findElement(By.id("draggable")).getAttribute("class");
		System.out.println(classVal);
		
		if(classVal.equals("ui-widget-content ui-draggable ui-draggable-handle")) {
			System.out.println("Testcase pass");
		}
		else {
			System.out.println("Testcase fail");
		}
		
	}

}
