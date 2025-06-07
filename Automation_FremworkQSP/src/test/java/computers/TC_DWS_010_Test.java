package computers;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import objectrepository.HomePage;

public class TC_DWS_010_Test extends BaseClass {
	@Test
	public void clickOnComputers() {
		ExtentTest test=eReport.createTest("clickOnComputers"); //Created object of ExtentTest class.
		test.log(Status.INFO, "Test execution started");
		HomePage hp=new HomePage(driver);
		hp.getComputersLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Computers");
		test.log(Status.PASS, "Computer page is dispayed");
	}

}
