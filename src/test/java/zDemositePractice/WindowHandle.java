package zDemositePractice;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		System.out.println("Title of main window: " + driver.getTitle());
		
		//===Handling Mouse Hover Dropdown ========
		Actions actions = new Actions(driver);
		WebElement switchTo=driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a"));
		actions.moveToElement(switchTo).perform();		
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[2]/a")).click();
		
		
		System.out.println("Title of main window: " + driver.getTitle());
		//Tabbed window
		/*driver.findElement(By.xpath("//div[@class=\"tabpane pullleft\"]/ul/li/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();*/
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button")).click();
		
		Set <String> windowId= driver.getWindowHandles();
		Iterator<String> iter=windowId.iterator();
		String mainWindow=iter.next();
		String childWindow=iter.next();
		
		driver.switchTo().window(childWindow);
		System.out.println("Title of child window: " + driver.getTitle());
		
		//driver.findElement(By.xpath("//*[@id=\"container\"]/header/div/div/div[2]/ul/li[3]/a")).click();
		driver.close();
		driver.switchTo().window(mainWindow);
		System.out.println("Title of main window: " + driver.getTitle());
		
		driver.quit();
		
	}

}
