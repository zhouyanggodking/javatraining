package godking.test;

import godking.Calculation;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class CalculationTest {

	private Calculation cal = new Calculation();
	
	@BeforeClass
	public static void BeforeClass(){
		System.out.println("Before class tasks");
	}
	
	@AfterClass
	public static void AfterClass(){
		System.out.println("After class tasks");
	}
	
	@Before
	public void Before(){
		System.out.println("Before each case tasks");
	}
	
	@After
	public void After(){
		System.out.println("After each case tasks");
	}
	
	@Test   //to indicate a test case
	public void addTest() {
		assertEquals(4, cal.add(1, 3));
	}
	
	@Ignore
	@Test
	public void subTest()
	{
		fail();
	}

	@Test(expected = Exception.class)
	public void exceptionTest() throws Exception{
		throw new Exception();
	}
	
}
