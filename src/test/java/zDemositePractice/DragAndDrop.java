package zDemositePractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class DragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Title of main window: " + driver.getTitle());
		
		//===Handling Mouse Hover Dropdown ========
		Actions actions = new Actions(driver);
		WebElement interaction=driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/a"));
		actions.moveToElement(interaction).perform();		
		WebElement drag_drop=driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/ul/li[1]/a"));
		actions.moveToElement(drag_drop).perform();
		// clicked on static		
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/ul/li[1]/ul/li[1]/a")).click();
		
		System.out.println("Title of main window: " + driver.getTitle());
		
		//Drag drop process
		driver.findElement(By.xpath("//*[@id=\"angular\"]")).click();
		WebElement dragme=driver.findElement(By.xpath("//*[@id=\"angular\"]"));
		WebElement dropme=driver.findElement(By.xpath("//*[@id=\"droparea\"]"));
		
		actions.dragAndDrop(dragme, dropme).perform();
		
		dragme=driver.findElement(By.xpath("//*[@id=\"mongo\"]"));
		dropme=driver.findElement(By.xpath("//*[@id=\"droparea\"]"));
		actions.dragAndDrop(dragme, dropme).perform();
		

		dragme=driver.findElement(By.xpath("//*[@id=\"node\"]"));
		dropme=driver.findElement(By.xpath("//*[@id=\"droparea\"]"));
		actions.dragAndDrop(dragme, dropme).perform();
		

	}
	
}
