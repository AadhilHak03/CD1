package Inheritance;

import org.testng.annotations.Test;

public class q1 extends q3{
	public q1(int a) {
		super(a);
		this.a=a;

	
	}
	//int a = 20;
	@Test
	public int hi() {
		
		a=a+1;
		return a;
	}
	@Test
	public int hi1() {
		
		a=a*2;
		return a;

	}
	@Test
	public int hi11() {
		
		a=a-1;
		return a;

	}
	
	
	
	
	
}
