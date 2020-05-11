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

public class ChomeBrowserTest {
	 private static AppiumDriver driver;   // Chanhes
	 public static void main(String[] args) throws MalformedURLException, InterruptedException {
	 
	 DesiredCapabilities capabilities = new DesiredCapabilities();
	 
	 capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	 capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
	 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
	 capabilities.setCapability(MobileCapabilityType.UDID,"ZY322G455B");
	 
	 capabilities.setCapability("appPackage", "com.android.chrome");
	 capabilities.setCapability("appActivity", "org.chromium.chrome.browser.document.ChromeLauncherActivity");
	 

	 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 Thread.sleep(5000);
	 System.out.println("Chrome Opened");
	 //driver.findElementByXPath("//*[@id='com.android.chrome:id/terms_accept']");
	 driver.findElementById("com.android.chrome:id/terms_accept").click();
	 //driver.findElementByXPath("//android.widget.Button[@id="com.android.chrome:id/next_button"]").click();
	 driver.findElementById("com.android.chrome:id/next_button").click();
	 driver.findElementById("com.android.chrome:id/negative_button").click();
	 driver.findElementById("com.android.chrome:id/search_box_text").sendKeys("Ammium");
	 driver.findElementById("com.android.chrome:id/url_bar").sendKeys(Keys.ENTER);
	 
	
	 }
	
}
