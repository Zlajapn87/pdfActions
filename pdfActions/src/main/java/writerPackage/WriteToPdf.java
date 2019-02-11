
package writerPackage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.AcroFields.Item;



public class WriteToPdf {
	
	public void writeUsingIText(String src, String dest) throws DocumentException, IOException {
    
		PdfReader reader = new PdfReader(src);
        PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(dest));
        AcroFields form = stamper.getAcroFields();
        
      //  System.out.println("Stamper list is: " +stamper);
        
        Map<String, Item> fields = form.getFields();
     //   System.out.println("List of the fields is: " +fields);
        
        form.removeXfa();
        form.setField("Name_First", "Nikola");
        form.setField("Name_Last", "Zlatkovic");
        form.setField("Name_Middle", "Ljubisa");
        stamper.close();
        reader.close();
    }

}
	
