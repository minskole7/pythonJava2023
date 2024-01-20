package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// wait ??
		
		// Dynamic wait  and static waits 
		// Dynamic waits ---> implicit , explicit wait ,  fluent wait 
		// Static        --->  thread.sleep()
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		driver.manage().window().maximize();
		
		// implicit wait 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		alertIsPresent()
//		elementSelectionStateToBe()
//		elementToBeClickable()
//		elementToBeSelected()
//		frameToBeAvaliableAndSwitchToIt()
//		invisibilityOfTheElementLocated()
//		invisibilityOfElementWithText()
//		presenceOfAllElementsLocatedBy()
//		presenceOfElementLocated()
//		textToBePresentInElement()
//		textToBePresentInElementLocated()
//		textToBePresentInElementValue()
//		titleIs()
//		titleContains()
//		visibilityOf()
//		visibilityOfAllElements()
//		visibilityOfAllElementsLocatedBy()
//		visibilityOfElementLocated()
		
		
		// Explicit wait()
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));	
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2[name='contactme']")));
		
		
		// Fluent wait()
		
		
		Wait wait = new FluentWait(driver)
		.withTimeout(Duration.ofSeconds(10))
		.pollingEvery(Duration.ofSeconds(2))
		.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("h2[name='contactme']")));
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		

	}

}
