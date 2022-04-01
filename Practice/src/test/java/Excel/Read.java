package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\karthick\\Documents\\data\\RegisterData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("sheet2");
		int Rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(0).getLastCellNum();
        System.out.println(Rowcount);
        System.out.println(colcount);

		for (int i = 0; i < Rowcount; i++) {
			XSSFRow currentrow = sheet.getRow(i);
			for (int j = 0; j < colcount; j++) {
				String cell = currentrow.getCell(j).toString();
				System.out.print("    "+cell);
			}
			System.out.println();
		}

	}

}
