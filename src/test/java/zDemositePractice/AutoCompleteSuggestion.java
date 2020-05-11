package zDemositePractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class AutoCompleteSuggestion {
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
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[5]/ul/li[2]/a")).click();
		System.out.println("Title of main window: " + driver.getTitle());
		
		driver.findElement(By.xpath("//div[@class=\"ui-autocomplete-multiselect ui-state-default ui-widget\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"ui-autocomplete-multiselect ui-state-default ui-widget\"]")).sendKeys("an");
		
		List<WebElement> suggestionList= driver.findElements(By.className("ui-menu-item"));
		
		for(WebElement sugg:suggestionList)
		{
			
			System.out.println(sugg.getText());
		}
		



	}
	
}
