import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class HelloWorld {
	public static void main(String[] args) {
		Document d = new Document();
		try{
			PdfWriter pw =PdfWriter.getInstance(d, new FileOutputStream("Hello world"));
			d.open();
			d.add(new Paragraph(" A hello world pdf document"));
			d.close();
			pw.close();
		}
		catch(DocumentException e){
			e.printStackTrace();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}

}
