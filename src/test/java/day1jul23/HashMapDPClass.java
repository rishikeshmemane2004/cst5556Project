package day1jul23;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HashMapDPClass {

	/*
	 *  String[]
	 	String[][]
	 	Object[]
	 	Object[][]
	 */
	
	
	
	@DataProvider(name="DP")
	public Object[] getData()
	{
		Object[] data = new Object[2];
		Map<String,String> map1 = new HashMap<>();
		map1.put("user", "u1");
		map1.put("pass", "p1");
		
		
		Map<String,String> map2 = new HashMap<>();
		map2.put("user", "u2");
		map2.put("pass", "p2");
		
		data[0] = map1;
		data[1] = map2;
		
		return data;
	}
	
	@Test(dataProvider="DP")
	public void test1(HashMap<String,String> map)
	{
		System.out.println(map.get("user") + " : " + map.get("pass"));
	}
	
	
	
}
