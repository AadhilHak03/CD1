package ListenersPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendRepo {
	 
	@Test
	public static  ExtentReports setUp() {
		// TODO Auto-generated method stub
		String fp = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter esr = new ExtentSparkReporter(fp);
		esr.config().setReportName("hi");
		esr.config().setDocumentTitle("yo");
		
		ExtentReports er = new ExtentReports();
		er.attachReporter(esr);
		er.setSystemInfo("Tester", "dad");
		return er;
		
	}

	/*@Test
	public void exe() {
		er.createTest("exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.google.com/");
		System.out.println(dr.getTitle());
		er.flush();
	
	}*/
}
