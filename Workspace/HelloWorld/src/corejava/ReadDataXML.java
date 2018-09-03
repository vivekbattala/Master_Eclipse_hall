package corejava;

import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;

public class ReadDataXML {

	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("C:\\Users\\Vivek\\Desktop\\java.xls");

		Workbook wb = Workbook.getWorkbook(file);

		Sheet sh = wb.getSheet("Sheet1");

		String cellValue = sh.getCell(2, 3).getContents();

		// System.out.println(cellValue);

		for (int i = 1; i < sh.getRows(); i++) // Read a all Data

		{
			for (int j = 0; j < sh.getColumns(); j++) {
				System.out.println(sh.getCell(i, j).getContents());
				//System.out.println();
			}
		}

		for (int i = 1; i < sh.getRows(); i++) // Read a specific column

		{
			System.out.println(sh.getCell(2, i).getContents());
		}
	}
}
