package day3Jul23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertiosn {

	@Test
	public void verifyAssertions()
	{
	System.out.println("Start of the program");
	//Assertions - validations
	// 2types of Assertions 
	// hard assertion (actual value, expetected value)
	// soft assertion
	
	// hard assertion 
	int a = 12;
	int b = 12;
	
//	Assert.assertEquals(a, b,"a and b are not equal");
	
//	Assert.assertTrue(a==b,"value of a is not equal value of b");
	
//	Assert.assertFalse(a==b,"value of a is equal value of b");
	
	
	int[] a1 = {1,2,3,4,5};
	int[] a2 = {11,21,31,41,51};
	
//	Assert.assertEquals(a1, a2, "Array a1 is not equal to array a2");
	
	List<Integer> al1 = new ArrayList<>(List.of(1,2,3));
	List<Integer> al2 = new ArrayList<>(List.of(1,2,32));
//	Assert.assertEquals(al1, al2);
	
	Set<Integer> s1 = new HashSet<>(List.of(1,2,3));
	Set<Integer> s2 = new HashSet<>(List.of(1,12,3));
//	Assert.assertEquals(s1, s2, "s1 is not equal s2");
	
	Map<Integer, String> m1 = new HashMap<>(Map.of(1,"Amit",2,"Rajan",3,"Anup"));
	Map<Integer, String> m2 = new HashMap<>(Map.of(1,"Amit",2,"Rajan",32,"Anup"));
//	Assert.assertEquals(m1,m2);
	
// TestNG can act as assertion library
	
	float f1 = 12.34f;
	float f2 = 12.344f;
	Assert.assertEquals(f1, f2,"f1 != f2");
	
	System.out.println("end of the program");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
