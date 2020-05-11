package PDFReaderPackage;

import java.io.IOException;

import com.testautomationguru.utility.PDFUtil;

public class PDFUtil_ReadPDF {

	public static void main(String [] args) throws IOException {
		String pdfLocation=System.getProperty("user.dir") + "\\pdfDocuments\\software_testing.pdf";
		
		PDFUtil pdfutil= new PDFUtil();
		
		//Page Count
		int pageCount=pdfutil.getPageCount(pdfLocation);
		
		System.out.println("Page count is : " + pageCount);
		
		// Read content 
		String entireContent=pdfutil.getText(pdfLocation,6,7);

		System.out.println("Page Content is : " + entireContent);
		
	}
	
}
