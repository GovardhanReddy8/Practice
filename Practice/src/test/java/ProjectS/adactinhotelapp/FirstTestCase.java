package ProjectS.adactinhotelapp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestCase {

	WebDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void Openurl() {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void Testcaseone() throws Exception {
		FileInputStream file = new FileInputStream("DataSheet\\TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Regin");
		Iterator<Row> row = sheet.rowIterator();
		row.next();
		Row rows = null;
		while (row.hasNext()) {
			rows = row.next();

			driver.findElement(By.linkText("New User Register Here")).click();
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(rows.getCell(1).getStringCellValue());
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(rows.getCell(2).getStringCellValue());
			driver.findElement(By.xpath("//input[@id='re_password']")).sendKeys(rows.getCell(3).getStringCellValue());
			driver.findElement(By.xpath("//input[@id='full_name']")).sendKeys(rows.getCell(4).getStringCellValue());
			driver.findElement(By.xpath("//input[@id='email_add']")).sendKeys(rows.getCell(5).getStringCellValue());
			driver.findElement(By.xpath("//input[@id='captcha-form']"));
			driver.findElement(By.xpath("//input[@id='tnc_box']")).click();
			driver.findElement(By.xpath("//input[@id='Submit']")).click();

		}
	}
}
