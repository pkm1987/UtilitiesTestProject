package PDFReaderPackage;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PDFBoxReaderTest {

	@Test
	public void readPDF() throws IOException {
		//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Drivers//geckodriver.exe");
		//WebDriver driver =new FirefoxDriver();
		//driver.get("file:///D:/Selenium/SeleniumProject/UtilitiesTestProject/pdfDocuments/employee-information-form-download-20170810.pdf");
		//String currentURL=driver.getCurrentUrl();
		URL url=new URL ("file:///D:/Selenium/SeleniumProject/UtilitiesTestProject/pdfDocuments/employee-information-form-download-20170810.pdf");
		InputStream is=url.openStream();  //It will open the URL
		BufferedInputStream fileparse= new BufferedInputStream(is); // read this PDF
		PDDocument document=null;
		
		document=PDDocument.load(fileparse);
		String pdfContent= new PDFTextStripper().getText(document);
		//System.out.println(pdfContent);
		Assert.assertTrue(pdfContent.contains("Company Name"));
				
				
		//======== Store the pdf content in notepad ===========
		FileWriter fw=new FileWriter(System.getProperty("user.dir")+ "\\pdfDocuments\\PDFContent.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(pdfContent);
		bw.close();
		
		//======= Read data from notepad =============
		FileReader fr=new FileReader(System.getProperty("user.dir")+ "\\pdfDocuments\\PDFContent.txt");
		BufferedReader br=new BufferedReader(fr);
		//Loop to read all lines one by one from file and print It.
		String sCurrentLine;
		
		while ((sCurrentLine = br.readLine()) != null){
			//if(br.readLine().contains("Information")) {
					System.out.println(br.readLine());
			//}
		}
		
	}
}
	
