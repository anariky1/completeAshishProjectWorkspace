package testcases;

import org.testng.annotations.Test;

public class TestA {
	
	@Test
	public void testA() throws InterruptedException{
		System.out.println("Test A start");
		Thread.sleep(10000);
		System.out.println("Test A end");
		
	}
	

}
