package TestngAssertStudy;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertsPractice {
 
	
	@Test
  public void myMethod() 
	{
		String a="Vyankat";
		String b="Vyankat";
		String c="vks";
		
		Assert.assertEquals(a, b,"TC is fail when a & b are not equal");
		Assert.assertNotEquals(b, c, "b & c are not match TC is fail");
		
  }
	
	@Test
	public void myMethod1()
	{
		String d=null;
		String e="vynkii";
		
		Assert.assertNull(d, "Tc is fail value is not null");
		Assert.assertNotNull(e,"Tc is fail when value is null");
	}
	
	@Test
	public void method()
	{
		boolean a=true;
		boolean b=false;
		
		Assert.assertTrue(a, "Tc is fail when value is not true");
		Assert.assertFalse(b, "Tc is fail when value is false");
		
	}
	
	
}
