package BasePackage;

import java.io.IOException;

import com.itextpdf.text.DocumentException;

import writerPackage.WriteToPdf;


public class BaseClass {
	

	public static void main(String[] args) throws DocumentException, IOException {
		
		
		ResourceClass sLocation = new ResourceClass();
		new WriteToPdf().writeUsingIText(sLocation.getSRC(), sLocation.getDEST());			
    }
		

}


