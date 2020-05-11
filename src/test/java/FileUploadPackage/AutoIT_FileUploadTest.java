package FileUploadPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

public class AutoIT_FileUploadTest extends BaseClass{

	@Test
	public void UpoloadAttachment() throws InterruptedException, FindFailed, IOException   {
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		WebDriverWait wait= new WebDriverWait(driver, 4000);
		
		driver.get(baseURL);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Pradip");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Mahato");
		//driver.findElement(By.xpath("//*[@id=\"imagesrc\"]")).click();
		Thread.sleep(3000);
	
		//Auto IT
		//We need to have Auto IT Finder tool and Auto IT Editor
		//Using Finder tool, identify the windows element (like- URL path and window button)
		//Write code in AutoIT editor using functions like(ControlFocus, ControlSetText, ControlClick) and save the file with extention ".au3".
		//Compile ".au3" file by Right Click "compile script (X64), which will generate ".exe" file.
		// Run in your Selenium using command- RunTime.getRuntime.exec("Path of .exe")
		
		
		// Run AutoIt exe file
		Runtime.getRuntime().exec(System.getProperty("user.dir") + "\\SikuliImage\\FileUpload.exe");
		
	}
}
