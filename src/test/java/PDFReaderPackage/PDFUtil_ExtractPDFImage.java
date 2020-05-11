package PDFReaderPackage;

import java.io.IOException;
import com.testautomationguru.utility.PDFUtil;

public class PDFUtil_ExtractPDFImage {

	public static void main(String [] args) throws IOException {
		String pdfLocation=System.getProperty("user.dir") + "\\pdfDocuments\\software_testing.pdf";
		String destImageLocation=System.getProperty("user.dir") + "\\pdfDocuments\\ExtractedImages\\";
		
		PDFUtil pdfutil= new PDFUtil();
		
		pdfutil.setImageDestinationPath(destImageLocation);
		
		pdfutil.extractImages(pdfLocation, 1, 1);
		
		
	}
}
