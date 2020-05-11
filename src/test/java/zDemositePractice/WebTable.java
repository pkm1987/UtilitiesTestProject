package zDemositePractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Title of main window: " + driver.getTitle());
		
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[3]/a")).click();
		
		Thread.sleep(5000);
		List<WebElement> emailList=driver.findElements(By.xpath("//*[@class=\"ui-grid-contents-wrapper\"]/div/div[2]/div/div/div/div[1]/div"));
		int rowCount=emailList.size();
		List<WebElement> ColList=driver.findElements(By.xpath("//*[@class=\"ui-grid-contents-wrapper\"]/div/div[2]/div/div[1]/div/div/div"));
		int colCount=ColList.size();
		
		
		
		String s="";
		for (int i=1;i<=rowCount; i++)
		{
			for(int j=1; j<=colCount;j++) 
			{
				s=driver.findElement(By.xpath("//*[@class=\"ui-grid-contents-wrapper\"]/div/div[2]/div/div[" + i + "]/div/div[" + j + "]/div")).getText();
				System.out.println(s);
				
			}
			
			System.out.println("=====================");
			
			
		}
		
		
		for(WebElement aa: emailList)
		{
			System.out.println("#############################");
			System.out.println(aa.getText());
		}
		
	
	}
	
}
