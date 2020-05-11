package zAppiumPOC;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class FacebookTest {

	 private static AppiumDriver driver;   // Chanhes
	 public static void main(String[] args) throws MalformedURLException, InterruptedException {
	 
	 DesiredCapabilities capabilities = new DesiredCapabilities();
	 
	 capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	 capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
	 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
	 capabilities.setCapability(MobileCapabilityType.UDID,"ZY322G455B");
	 
	 capabilities.setCapability("appPackage", "com.facebook.katana");
	 capabilities.setCapability("appActivity", "com.facebook.adscomposer.AdsComposerActivity");
	 

	 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	 Thread.sleep(5000);
	 System.out.println("FaceBook Opened");
	 
	 //driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	 }
}
