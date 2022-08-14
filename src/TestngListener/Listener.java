package TestngListener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import PropertyKiteBase.FailNewBase;
import io.netty.handler.codec.http.HttpContentEncoder.Result;

public class Listener extends FailNewBase implements ITestListener {

	FailNewBase b=new FailNewBase();
		
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
	
		String TCID = result.getName();
		try {
			b.getScreenShot(TCID);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void onTestStart(ITestResult result) 
	{
		Reporter.log("TC is statrting "+result.getName(),true);
		
	}
	
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("TC is skipped "+result.getName(),true);
		
	}
	
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
	  Reporter.log("TC execution is successful "+result.getName(),true);	
	}
	
	
}
