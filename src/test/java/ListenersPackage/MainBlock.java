package ListenersPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainBlock {
	@Test
	public void t1() {
		String name = "Adil";
		
		System.out.println(name);
		
		Assert.assertEquals(name, "Adil");
	}


	@Test(retryAnalyzer=Retry.class)
	public void t2() {
	
	String age = "21";
	
	System.out.println(age);
	
	Assert.assertEquals(age, "21");
	
	}
	
	@Test
	public void t3() {
		System.out.println("new push");
	}
	

	








}


