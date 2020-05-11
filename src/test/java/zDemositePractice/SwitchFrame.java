package zDemositePractice;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchFrame {

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
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[3]/a")).click();
		
		/*WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"footer\"]/div/div/div[1]/a")));
		*/
		driver.switchTo().frame("0");
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Default Frame");
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//*[@id=\"footer\"]/div/div/div[1]/a")).click();
		
	/*	driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Child Frame");
		*/
				
	}

}
