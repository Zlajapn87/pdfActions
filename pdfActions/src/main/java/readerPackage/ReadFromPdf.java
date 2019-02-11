package readerPackage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.AcroFields.Item;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import BasePackage.ResourceClass;

public class ReadFromPdf {
	
	private String dest = new ResourceClass().getDEST();
	PdfReader reader = null; 
	public void manipulatePdf(String dest) throws DocumentException, IOException {
		
		
		
		
        AcroFields Item  = reader.getAcroFields();
        System.out.println(Item);
        
        try {
        	
        	reader = new PdfReader(dest);
            // pageNumber = 1
            String textFromPage = PdfTextExtractor.getTextFromPage(reader, 1);
          //  String First_Name = form.getFieldRichValue("First_Name");

            System.out.println(textFromPage);
       //     System.out.println(First_Name);

	            reader.close();
	            
        } catch (IOException e) {
            e.printStackTrace(); 
            
        }
        }
}
