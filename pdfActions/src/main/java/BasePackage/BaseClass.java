package BasePackage;

import java.io.IOException;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfReader;

import readerPackage.ReadFromPdf;
import writerPackage.WriteToPdf;


public class BaseClass {
	
	
	public static void main(String[] args) throws DocumentException, IOException {
		
		ReadFromPdf reader = new ReadFromPdf();
		ResourceClass sLocation = new ResourceClass();
		new WriteToPdf().writeUsingIText(sLocation.getSRC(), sLocation.getDEST());	
		//new ReadFromPdf().manipulatePdf(sLocation.getDEST()); */
		
    }
		

}


