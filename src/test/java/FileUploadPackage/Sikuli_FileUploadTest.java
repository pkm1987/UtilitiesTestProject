package FileUploadPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.Test;

import net.bytebuddy.description.modifier.Visibility;

public class Sikuli_FileUploadTest extends BaseClass {

		@Test
		public void UpoloadAttachment() throws InterruptedException, FindFailed   {
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			WebDriverWait wait= new WebDriverWait(driver, 4000);
			
			driver.get(baseURL);
			
			/*driver.findElement(By.id("identifierId")).sendKeys("pradip.aec");
			driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("06051987");
			driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
			Thread.sleep(4000);		
			driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div[1]/div/div")).click();
			driver.findElement(By.xpath("//*[@id=':q9']")).sendKeys("pradip.aec@gmail.com");
			driver.findElement(By.xpath("//*[@id=':pr']")).sendKeys("File Upload through sikuli");
			driver.findElement(By.xpath("//*[@id=':qw']")).sendKeys("File Upload through sikuli");
			Thread.sleep(5000);		
			driver.findElement(By.xpath("//*[@id=':r9']")).click();
			Thread.sleep(3000);*/
			Thread.sleep(3000);
			//driver.findElement(By.id("imagesrc")).click();
			Thread.sleep(3000);
			
			//Using sikuli to upload files now and also reading test from the image via OCR
			Pattern FileNameInput=  new Pattern(System.getProperty("user.dir") + "\\SikuliImage\\FileOpenInput.JPG");
			Pattern OpenButton=  new Pattern(System.getProperty("user.dir") + "\\SikuliImage\\OpenButton.JPG");
			
			Screen screen=new Screen();
			screen.type(FileNameInput,System.getProperty("user.dir") + "\\SikuliImage\\chromedriver_win32.zip");
			screen.click(OpenButton);
			Thread.sleep(3000);		
			
		
		}

	}

