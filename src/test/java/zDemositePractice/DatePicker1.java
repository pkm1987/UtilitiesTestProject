package zDemositePractice;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DatePicker1 {

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
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/form/div[2]/div[2]/img")).click();
		
		 		
		String dob="06/05/1987";
		// Capturing Year and Month ===
		String year= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
		int Appyr=Integer.parseInt(year);
		String month= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
		System.out.println(month + "   " + Appyr);

		Boolean flag=true;
		
		while(flag.equals(true))
		{	//Back icon
			driver.findElement(By.xpath("//*[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();
			
			// Capturing Year and Month ===
			year= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText().trim();
			Appyr=Integer.parseInt(year);
			month= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText().trim();
			System.out.println(month + "   " + Appyr);
			
			if((month.equalsIgnoreCase("May")) && (year.equalsIgnoreCase("2019")))
			{
				System.out.println("Reached to Year Month");
				int count= driver.findElements(By.xpath("//*[@class=\"ui-state-default\"]")).size();
				
				for(int i=1; i<=count;i++)
				{	
					String classXpath="'ui-state-default'";
					String dateXpath="//*[@class=" + classXpath + " and text()=" + i + "]";
					String calenderdate=driver.findElement(By.xpath(dateXpath)).getText();
					System.out.println("Date: " + calenderdate);
					if (calenderdate.equalsIgnoreCase("6"))
					{	
						System.out.println("Reached Date");
						driver.findElement(By.xpath(dateXpath)).click();
						flag=false;
						break;
						
					}
				}
			}
			
			
			
						
		}
		
		System.out.println("Out from loop");
		
	}
}
