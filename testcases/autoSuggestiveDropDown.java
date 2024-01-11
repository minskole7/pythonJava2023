package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestiveDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		
		// get the title of the page 
		
		String title = driver.getTitle();
		
		if(title.equals("WebDriver | Contact Us")) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		
		WebElement element = driver.findElement(By.id("myInput"));
		element.sendKeys("A");
		List <WebElement> elements =driver.findElements(By.cssSelector("#myInputautocomplete-list > div"));
		for(int i = 0 ; i < elements.size() ; i++) {
			if(elements.get(i).getText().contains("Almond")){
				elements.get(i).click();
				driver.findElement(By.id("submit-button")).click();
				if(driver.getCurrentUrl().contains("Almond")) {
					System.out.println("Test case pass");
					break;
				}
				else{
					System.out.println("Test case fail");
				};
			}
			
		}
		WebElement elementI = driver.findElement(By.id("myInput"));
		elementI.clear();
		elementI.sendKeys("G");
		List <WebElement> elementss =driver.findElements(By.cssSelector("#myInputautocomplete-list > div"));
		for(int i = 0 ; i < elementss.size() ; i++) {
			if(elementss.get(i).getText().contains("Grapes")){
				elementss.get(i).click();
				driver.findElement(By.id("submit-button")).click();
				if(driver.getCurrentUrl().contains("Grapes")) {
					System.out.println("Test case pass");
					break;
				}
				else{
					System.out.println("Test case fail");
				};
			}
			
		}
		
		driver.close();
		

	}

}
