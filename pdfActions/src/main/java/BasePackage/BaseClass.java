package BasePackage;

import java.io.IOException;

import com.itextpdf.text.DocumentException;

import writerPackage.WriteToPdf;


public class BaseClass {
	
    public static final String SRC = "C:\\Users\\nikola.zlatkovic\\Desktop\\Selenium\\Test\\interactiveform_enabled.pdf";
    public static final String DEST = "C:\\Users\\nikola.zlatkovic\\Desktop\\Selenium\\\\Test\\TestPDF.pdf";

	public static void main(String[] args) throws DocumentException, IOException {
		
		new WriteToPdf().writeUsingIText(SRC, DEST);			
    }
		

}


