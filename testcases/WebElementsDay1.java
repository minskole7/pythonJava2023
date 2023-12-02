package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsDay1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// <h1 id = "one" class = "two" name = "three">HeadOne<h1>
		// click()
		
		// Arrangement 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
//		// Action 
//		
//		driver.findElement(By.name("first_name")).sendKeys("chinmay");
//		driver.findElement(By.name("last_name")).sendKeys("deshpande");
//		driver.findElement(By.name("email")).sendKeys("chinmaydesspande010@gmail.com");
//		driver.findElement(By.name("message")).sendKeys("I am learning JS");
//		driver.findElement(By.cssSelector("[type = 'submit']")).click(); // click
//		// Assertion
//		boolean q1 = driver.findElement(By.tagName("h1")).isDisplayed();
//		if(q1) {
//			System.out.println("Login successful");
//		}
//		else {
//			System.out.println("Login not successful");
//		}
		
		//-------------------------------------------------------------->
		

		// sendKeys()
		
//		driver.findElement(By.name("first_name")).sendKeys("chinmay"); // sendkeys()
//		driver.findElement(By.name("last_name")).sendKeys("deshpande");
//		driver.findElement(By.name("email")).sendKeys("chinmaydesspande010@gmail.com");
//		driver.findElement(By.name("message")).sendKeys("I am learning JS");
//		driver.findElement(By.cssSelector("[type = 'reset']")).click(); 
//		String text = driver.findElement(By.name("first_name")).getText();
//		if(text.equals("")) {
//			System.out.println("Testcase pass");
//		}
//		else {
//			System.out.println("Testcase fail");
//		}

		// getText()
		//<h2 name="contactme" class="section_header">CONTACT US</h2>
		
//		String txt = driver.findElement(By.name("contactme")).getText();
//		if(txt.equals("CONTACT US")) {
//			System.out.println("Test case pass");
//		}
//		else {
//			System.out.println("Test case fail");
//		}
		
	
		// getAttribute()
		
    //	String className = driver.findElement(By.name("contactme")).getAttribute("class");
//		if(className.equals(("section_header")){
//			System.out.println("Testcase pass");
//		}
//		else {
//			System.out.println("Testcase fail");
//		}
		
		// clear()
		
//		WebElement userName = driver.findElement(By.name("first_name"));
//		userName.sendKeys("I am writing something");
//		Thread.sleep(3000);
//		userName.clear();
//		
		
		
		// isEnabled()
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		boolean availC = driver.findElement(By.cssSelector("[value='cabbage']")).isEnabled();
		if(availC) {
			System.out.println("Test case fail");
		}
		else {
			System.out.println("Test case pass");
		}

		// isDisplayed()
		
		boolean avail3 = driver.findElement(By.tagName("h1")).isDisplayed();
		if(avail3) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("testcase fail");
		}
	
		// isSelected()
		
		boolean avail4 = driver.findElement(By.cssSelector("[value='cabbage']")).isSelected();
		if(avail4) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}

	}

}
