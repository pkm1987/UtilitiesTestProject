package Ashot_Shutterbug;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class CompareImage {

public static void main(String [] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in/");
		Thread.sleep(3000);
		
		BufferedImage expectedImage=ImageIO.read(new File(System.getProperty("user.dir") + "\\AshotImages\\LogowithDot.png"));
		
		
		WebElement webelement= driver.findElement(By.xpath("//*[@id=\"logo\"]"));
		// Element Screenshot
		Screenshot logoImageScreenshot= new AShot().takeScreenshot(driver, webelement);
		BufferedImage ActualImage= logoImageScreenshot.getImage();
		
		
		ImageDiffer imgDiff= new ImageDiffer();
		ImageDiff diff=imgDiff.makeDiff(expectedImage, ActualImage);
		
		if(diff.hasDiff()){
			System.out.println("Images are not matching");
		}
			else {
				System.out.println("Images are matching");	
		}
	
	}

}
