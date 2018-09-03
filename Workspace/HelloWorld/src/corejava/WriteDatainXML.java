package corejava;

import java.io.FileOutputStream;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class WriteDatainXML {

	public static void main(String[] args) throws Exception {
		FileOutputStream file = new FileOutputStream("C:\\Users\\Vivek\\Desktop\\java2.xls");
	
	WritableWorkbook wr=Workbook.createWorkbook(file);
	WritableSheet ws=wr.createSheet("results", 0);
	
	Label un= new Label(0,0,"Vivek");
	ws.addCell(un);
	wr.write();
	wr.close();
	
	}

}
