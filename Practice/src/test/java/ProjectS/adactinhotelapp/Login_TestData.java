package ProjectS.adactinhotelapp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Login_TestData {
	WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");

	}

	@Test
	public void Loginapp() throws Exception {
		FileInputStream file = new FileInputStream("DataSheet\\TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Datasheet");
		Iterator<Row> rows = sheet.rowIterator();
		rows.next();
		Row row = null;
		while (rows.hasNext()) {
			row = rows.next();
			driver.findElement(By.xpath("//*[@name='username']")).sendKeys(row.getCell(0).getStringCellValue());
			driver.findElement(By.xpath("//*[@name='password']")).sendKeys(row.getCell(1).getStringCellValue());
			driver.findElement(By.xpath("//*[@name='login']")).click();
			Assert.assertEquals(driver.getTitle(), row.getCell(2).getStringCellValue());

		}

	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.close();

	}
}
