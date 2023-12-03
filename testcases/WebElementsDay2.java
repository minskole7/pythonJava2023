package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsDay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Done
		// click()

		// sendKeys()

		// getText()

		// getAttribute()

		// clear()

		// isEnabled()

		// isDisplayed()

		// isSelected()

		// submit() // Tagname => form

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
//		
//		driver.findElement(By.cssSelector("[name= 'first_name']")).sendKeys("chinmay");
//		driver.findElement(By.cssSelector("[name= 'last_name']")).sendKeys("deshpande");
//		driver.findElement(By.cssSelector("[name= 'email']")).sendKeys("chinmaydeshpande010@gmail.com");
//		driver.findElement(By.cssSelector("[name= 'message']")).sendKeys("I am learning js");
//		driver.findElement(By.id("contact_form")).submit();
//		boolean  avail = driver.findElement(By.tagName("h1")).isDisplayed();
//		if(avail) {
//			System.out.println("Testcase pass");
//		}
//		else {
//			System.out.println("Testcase fail");
//		}
//		
//		driver.close();
//		

		// getTagName()
		// Test case 2

//		String tagName = driver.findElement(By.cssSelector("[name='message']")).getTagName();
//		if (tagName.equals("textarea")) {
//			System.out.println("Testcase pass");
//		} else {
//			System.out.println("Test case fail");
//		}
//		
//		driver.close();
//	
		// getCssValue()
//		String getFontWeight = driver.findElement(By.cssSelector("[name='message']")).getCssValue("font-weight");
//		System.out.println(getFontWeight);
//		if(Integer.parseInt(getFontWeight) == 500) {
//			System.out.println("Test case pass");
//		}
//		else {
//			System.out.println("Test case fail");
//		}
//		driver.close();
		
	
		// getLocation()
		
//		Point p  = driver.findElement(By.id("contact_form")).getLocation();
//		System.out.println(p);
//		driver.close();
		
		// getSize()
		
		List<WebElement> classNameContact_Button = driver.findElements(By.className("contact_button"));
		int count = classNameContact_Button.size();
		if(count == 2) {
			System.out.println("Testcase pass");
		}
		else {
			System.out.println("Test case fail");
		}
		

		// Next class
		// findElement

		// findElements

		// getRect()

	}

	
}
