package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsDay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Testcase one 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		// Weblements 
		
		WebElement firstName = driver.findElement(By.cssSelector("input[name ='first_name']"));
		WebElement lastName = driver.findElement(By.cssSelector("input[name ='last_name']"));
		WebElement email = driver.findElement(By.cssSelector("input[name ='email']"));
		WebElement message = driver.findElement(By.cssSelector("textarea[name ='message']"));
		WebElement formButton = driver.findElement(By.cssSelector("input[type=\"submit\"]"));			 
		WebElement form = driver.findElement(By.id("contact_form"));
		
		// sendKeys() , click() ,submit() , isDisplayed()
		
		firstName.sendKeys("chinmay");
		lastName.sendKeys("deshpande");
		email.sendKeys("chinmaydeshpande010@gmail.com");
		message.sendKeys("I am learning js");
		//formButton.click();
		form.submit();
		
		
		WebElement msg = driver.findElement(By.tagName("h1"));
		boolean avail = msg.isDisplayed();
		if(avail) {
			System.out.println("testcase pass");
		}
		else {
			System.out.println("testcase fail");
		}
		
		driver.close();
		
		
		
		
		
	}

}
