package pack1;

import java.util.HashMap;

public class Data {

	public  static  HashMap<String,String> getUserLoginInfo()
	{
		HashMap<String,String>usermap=new HashMap<String,String>();
		usermap.put("customer","naveenk_test@123");
		usermap.put("admin","adminuser_test@123");
		return usermap;
		
	}
	public static  HashMap<Integer, String> monthMapInfo()
	{
		HashMap<Integer,String>monthmap=new HashMap<Integer,String>();
		monthmap.put(1,"January");
		monthmap.put(2,"February");
		monthmap.put(3,"March");
		monthmap.put(4,"April");
		monthmap.put(5,"May");
		monthmap.put(6,"Jun");
		monthmap.put(7,"July");
		monthmap.put(8,"August");
		monthmap.put(9,"September");
		monthmap.put(10,"October");
		monthmap.put(11,"November");
		monthmap.put(12,"December");
		return monthmap;
	}
	
}
