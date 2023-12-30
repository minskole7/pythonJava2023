package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Data-Table/index.html");
		driver.manage().window().maximize();
		
		// total numbers of rows 
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr"));
		System.out.println(rows.size());
		
		
		// total number columns 
		
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr[2]/td"));
		System.out.println(columns.size());
		
		
		// iterate over every row and 3rd column and add the age 
		int total = 0;
		for(int i = 2 ; i  <= rows.size();i++) {
			
			String age = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr["+i+"]//td[3]")).getText();		
			System.out.println(age);
			
			total = total + Integer.valueOf(age) ;

			
			// loop iteration
			//*[@id="t01"]/tbody/tr[2]//td[3]
			//*[@id="t01"]/tbody/tr[3]//td[3]
			//*[@id="t01"]/tbody/tr[4]//td[3]
		}
		
		System.out.println(total/rows.size()-1);
		
		
		// table 2
		// iterate over every row and 3rd column and add the age 
		int total2 = 0;
		for(int i = 2 ; i  <= rows.size();i++) {
			
			String age = driver.findElement(By.xpath("//*[@id=\"t02\"]/tbody/tr["+i+"]//td[3]")).getText();		
			System.out.println(age);
			
			total2 = total2 + Integer.valueOf(age) ;

			
			// loop iteration
			//*[@id="t01"]/tbody/tr[2]//td[3]
			//*[@id="t01"]/tbody/tr[3]//td[3]
			//*[@id="t01"]/tbody/tr[4]//td[3]
		}
		
		System.out.println(total2);
		
		
		for(int i = 2 ; i  <= rows.size();i++) {
			
			String first_name = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr["+i+"]//td[1]")).getText();	
			if(first_name.equals("Michael")) {
				System.out.println("Testcase pass Michael found");
				break;
			}
			
			
		}

		
		
		
		
		
		
		
		
		
		
	}

}
