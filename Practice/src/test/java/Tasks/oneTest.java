package Tasks;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class oneTest {
	WebDriver driver;

	public void test() throws IOException {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		
		String path = "DataSheet\\TestData1.xlsx";
		FileInputStream file = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sheet = wb.getSheet("com.adactin.hotelapp");
		int lastRowNum = sheet.getLastRowNum();
		for (int i = 0; i < lastRowNum; i++) {
			String st = sheet.getRow(i).getCell(0).getStringCellValue();
			
			driver.findElement(By.xpath("//input[@id='username']")).clear();
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(st);
			driver.findElement(By.xpath("//input[@id='password']")).clear();
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(st);
			driver.findElement(By.xpath("//input[@id='login']")).click();

}
}

}
