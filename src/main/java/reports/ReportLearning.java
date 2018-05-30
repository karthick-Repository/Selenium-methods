package reports;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportLearning {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       ExtentHtmlReporter result= new ExtentHtmlReporter("./reports/report.html");
       result.setAppendExisting(true);
       ExtentReports ext = new ExtentReports();
       ext.attachReporter(result);
       ExtentTest testcase = ext.createTest("TC001_EditLead", "Editing a exisitng Lead");
       testcase.pass("username successfully entered",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
       testcase.pass("Password successfully entered",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img2.png").build());
       testcase.fail("login failed",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img14.png").build());
       ext.flush();
	}
}