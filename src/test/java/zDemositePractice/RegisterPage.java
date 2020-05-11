package zDemositePractice;


import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class RegisterPage {

	public static void main(String [] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Pradip");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Mahato");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Additional Text");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("abcde@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("8765676567");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
		WebElement skillList= driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
		Select select= new Select(skillList);
		select.selectByVisibleText("AutoCAD");
				
		driver.findElement(By.xpath(""));
		driver.findElement(By.xpath(""));
		
		//*[@id="firstpassword"]
		//*[@id="secondpassword"]
		
		
		
		
		
		
		
	}
	
}
