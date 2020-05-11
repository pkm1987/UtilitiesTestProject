package zDemositePractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DatePicker2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Title of main window: " + driver.getTitle());
		
		//===Handling Mouse Hover Dropdown ========
		Actions actions = new Actions(driver);
		WebElement switchTo=driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[5]/a"));
		actions.moveToElement(switchTo).perform();		
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[5]/ul/li[3]/a")).click();
		System.out.println("Title of main window: " + driver.getTitle());
		
		//Clicked on Date picker
		driver.findElement(By.xpath("//*[@id=\"datepicker2\"]")).click();
		
		 		
		String dob="06/05/2019";
		// Capturing Year and Month ===
		
		Select monthSelect= new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/select[1]")));
		monthSelect.selectByVisibleText("June");
		
		Select YearSelect= new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/select[2]")));
		YearSelect.selectByVisibleText("2019");
		
		
				int count= driver.findElements(By.xpath("//*[contains(@class,\"dp15\")]")).size();
				
				for(int i=1; i<=count;i++)
				{	
					String classXpath="//*[contains(@class,\"dp15\")";
					String dateXpath=classXpath + " and text()=" + i + "]";
					String calenderdate=driver.findElement(By.xpath(dateXpath)).getText();
					System.out.println("Date: " + calenderdate);
					if (calenderdate.equalsIgnoreCase("6"))
					{	
						System.out.println("Reached Date");
						driver.findElement(By.xpath(dateXpath)).click();
						break;
						
					}
				}
			
		
	}
}
