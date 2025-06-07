package genericutility;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class ListenerUtility extends BaseClass implements ITestListener{

	public void onTestStart(ITestResult result) {
		test=eReport.createTest(result.getName());
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getName()+" is failed");
		TakesScreenshot ts=(TakesScreenshot) driver;
		String screenshots = ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(screenshots);
		
		try {
			wUtil.getPhoto(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

		
	
	
	

}
