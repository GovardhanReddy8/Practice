package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import common.BasePage;

public class UtilKit extends BasePage {

	public static Object[][] getData(String sheetname, String testcase) throws IOException {
		FileInputStream fis = new FileInputStream("DataSheet\\TestData1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		ArrayList<Row> testrows = new ArrayList<Row>();
		testrows = findRows(sheet, testcase);
		Object[][] obj = new Object[testrows.size() - 1][testrows.get(0).getLastCellNum() - 1];
		for (int i = 0; i < testrows.size() - 1; i++) {
			for (int j = 0; j < testrows.get(0).getLastCellNum() - 1; j++) {
				obj[i][j] = testrows.get(i + 1).getCell(j + 1).toString();

			}

		}

		return obj;

	}

	private static ArrayList<Row> findRows(Sheet sheet, String testcase) {
		ArrayList<Row> cases = new ArrayList<Row>();
		ArrayList<Row> rows = new ArrayList<Row>();
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			if (!(sheet.getRow(i) == null)) {
				cases.add(sheet.getRow(i));

			}

		}
		for (int i = 0; i < cases.size(); i++) {
			if (cases.get(i).getCell(0).getStringCellValue().equals(testcase)) {
				rows.add(cases.get(i));
			}

		}

		return rows;
	}

}
