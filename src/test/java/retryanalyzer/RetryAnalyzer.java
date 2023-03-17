package retryanalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	int count = 0, num = 4;

	public boolean retry(ITestResult result) {

		while (count < num) {
			count++;
			return true;
		}

		return false;
	}

}
