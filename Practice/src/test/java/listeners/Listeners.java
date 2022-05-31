package listeners;

import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test was started successfully");
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test is executed successfully:"+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test is failed because of some error");
		

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test was skipped because of in implimentation");
	
	}

	

}
