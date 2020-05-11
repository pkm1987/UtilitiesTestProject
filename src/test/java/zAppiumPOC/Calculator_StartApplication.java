package zAppiumPOC;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
 
public class Calculator_StartApplication {
 
 private static AppiumDriver driver;   // Chanhes
 public static void main(String[] args) throws MalformedURLException, InterruptedException {
 
 DesiredCapabilities capabilities = new DesiredCapabilities();

 capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
// capabilities.setCapability(MobileCapabilityType.UDID,"ZY322G455B");
 capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
 capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
 capabilities.setCapability("appPackage", "com.google.android.calculator");
 capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
 

 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
 Thread.sleep(5000);
 driver.findElementById("com.google.android.calculator:id/digit_7").click();
 driver.findElementById("com.google.android.calculator:id/op_add").click();  // +
 driver.findElementById("com.google.android.calculator:id/digit_3").click();  //3
 //driver.findElementById("com.google.android.calculator:id/eq").click();     //=
 String result=driver.findElementById("com.google.android.calculator:id/result_preview").getText();  //Result
 if (result.equals("10"))
 {
	 System.out.println("Test Pass");
 }
 else
 {
	 System.out.println("Test Fail");
 }
 
 
 driver.quit();
 
 }
 
}