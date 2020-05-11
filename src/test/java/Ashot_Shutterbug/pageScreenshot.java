package Ashot_Shutterbug;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class pageScreenshot {

public static void main(String [] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		
		//WebElement webelement= driver.findElement(By.xpath("//*[@id=\"logo\"]"));
		
		// Element Screenshot
		Screenshot elementScreenshot= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		
				
				//takeScreenshot(driver, webelement);
		ImageIO.write(elementScreenshot.getImage(),"PNG",new File(System.getProperty("user.dir") + "\\AshotImages\\Fullpage.png"));
		
	
	}
}
