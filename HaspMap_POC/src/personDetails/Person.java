package personDetails;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Person {
	
public static void main(String[] args) {
	
	HashMap<String, Map<Integer,String>> per = new HashMap<String, Map<Integer,String>>();
	
	Map<Integer,String> mp = new HashMap<Integer,String>();
	mp.put(101, "Manager");
	mp.put(102, "Developer");
	mp.put(103, "Tester");

	Map<Integer,String> mp1 = new HashMap<Integer,String>();
	mp1.put(104, "Line Manager");
	mp1.put(105, "Analyst");
	mp1.put(106, "Tester");

	Map<Integer,String> mp2 = new HashMap<Integer,String>();
    mp2.put(107, "Developer");
    mp2.put(108, "QE Engineer");
	
	per.put("Raghu", mp);
	per.put("Janani", mp1);
	per.put("Abi", mp2);
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the name:");
	String inputkey = sc.next();
	System.out.println(inputkey+ ":" +per.get(inputkey));
}

}


