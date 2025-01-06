package ListenersPackage;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
//ComeBack and add extent reports w/ss and retry listener
	
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		int count = 0;
		int mt = 1;
		if(count<mt)
		{
			count++;
			return true;
		}
		return false;
	}

}
