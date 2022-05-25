package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class Kit {
	WebDriver driver;
	public void data() throws IOException {
		FileInputStream file = new FileInputStream("DataSheet\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		Sheet sheet = wb.getSheet("Regin");
		Iterator<Row> rows = sheet.rowIterator();
		Row row=null;
		rows.next();
		while (rows.hasNext()) {
			row=rows.next();
			row.getCell(3).getStringCellValue();
			row.getCell(4).getStringCellValue();
			
		}
			
		}
		

}
