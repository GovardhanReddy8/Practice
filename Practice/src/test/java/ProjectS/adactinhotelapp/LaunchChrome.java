package ProjectS.adactinhotelapp;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LaunchChrome {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");

	}

	@Test
	public void openBrowser() throws Exception {
		FileInputStream file = new FileInputStream("DataSheet\\TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sName = wb.getSheet("DataSheet");
		Iterator<Row> rows = sName.rowIterator();
		rows.next();
		Row row = null;
		while (rows.hasNext()) {
			row = rows.next();
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(row.getCell(0).getStringCellValue());
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(row.getCell(1).getStringCellValue());
			driver.findElement(By.xpath("//input[@id='login']")).click();

			Assert.assertEquals(driver.getTitle(), row.getCell(2).getStringCellValue());
			

		}

	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();

	}

}
