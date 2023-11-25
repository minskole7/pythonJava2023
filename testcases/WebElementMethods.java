package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");
		
		//<h1 id = "id" class = "name" name = "nm">Hello</h1>
		
		WebElement user_name  = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("login-button"));
		WebElement Logincredentials = driver.findElement(By.id("login_credentials"));
		
		// <input type="text" class="form_input" data-test="username" id="user-name" name="user-name" placeholder="Username" autocorrect="off" autocapitalize="none" value="">
	
		// sendKeys()  method - 1
		user_name.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
	
		// click()     method - 2
		//loginButton.click();
			
		
		// clear()    method - 3
		user_name.clear();
		password.clear();
		
	
		//getAttribute()  method - 4
		//<input type="text" class="form_input" data-test="username" id="user-name" name="user-name" placeholder="Username" autocorrect="off" autocapitalize="none" value="">
		
		String attributeValue = user_name.getAttribute("class");
		System.out.println(attributeValue);
		
		
		//getTagName()   method - 5
		String tagNameText = user_name.getTagName();
		System.out.println(tagNameText);
		
		// getText()  - method - 6
		// <h4>Hello</h4>
		String txt = Logincredentials.getText();
		System.out.println(txt);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		
		
		
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}
	

}
