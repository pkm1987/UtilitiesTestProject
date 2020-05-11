package zDemositePractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		System.out.println("Title of main window: " + driver.getTitle());
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//Entering Text
		js.executeScript("document.getElementById('email').value='krishna@gmail.com'");
		//page refresh
		js.executeScript("history.go(0)");
		//get  String
		String btn= js.executeScript("return document.getElementById('btn2').innerHTML").toString();
		System.out.println(btn);

		//Entering Text
		js.executeScript("document.getElementById('email').value='krishna@gmail.com'");
		
		//Clicking Element
		js.executeScript("document.getElementById('enterimg').click()");
		//get  Title
		String title=js.executeScript("return document.title").toString();
		System.out.println(title);
		
		//js.executeScript("window.scrollBy(0,500)");
		//js.executeScript("window.scrollBy(0,document.body.scrollHieght)");
		js.executeScript("document.getElementById('Skills').scrollIntoView()");
		
		//back and forward
		js.executeScript("window.history.back()");
		Thread.sleep(3000);
		js.executeScript("window.history.forward()");
	}

}
