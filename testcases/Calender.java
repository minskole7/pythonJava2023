package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Datepicker/index.html");
		driver.findElement(By.id("datepicker")).click();
		selectDate(driver,"June","2024","24");

	}

	private static void selectDate(WebDriver driver ,String month, String year, String date) {
			
			// selecting month and year
			while(true) {
				String actualMonthYear = driver.findElement(By.className("datepicker-switch")).getText(); //"December 2023"
				String montha = actualMonthYear.split(" ")[0];
				String yeara = actualMonthYear.split(" ")[1];
				if(montha.equals(month) && yeara.equals(year)) {
					break;
				}
				driver.findElement(By.cssSelector(".next")).click();
					
			}
			
		
			List<WebElement> days = driver.findElements(By.cssSelector(".day"));
			for(int i = 0 ; i < days.size() ; i++) {
				if(days.get(i).getText().equals(date)) {
					days.get(i).click();
					break;
				}
			}
			
			
			
			
		
		
	}

}
