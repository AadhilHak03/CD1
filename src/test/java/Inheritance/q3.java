package Inheritance;

import org.testng.annotations.Test;

public class q3 {
	int a =20;
	
	public q3(int a) {
		
		this.a=a;
	}
	
	@Test
	public int hi111() {
		
		a=a+10;
		return a;

	}
}
