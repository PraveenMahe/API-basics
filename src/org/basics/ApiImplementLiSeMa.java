package org.basics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ApiImplementLiSeMa {

	public static void main(String[] args) throws IOException {

		ApiBasics a = new ApiBasics();
		a.readDataFromDb();
		a.setUserName("Praveen");
		a.setPassWord("Praveen@101");

		ApiBasics a1 = new ApiBasics();
		a1.readDataFromDb();
		a1.setUserName("Naveen");
		a1.setPassWord("Naveen@102");

		ApiBasics a2 = new ApiBasics();
		a2.readDataFromDb();
		a2.setUserName("Raveen");
		a2.setPassWord("Raveen@103");

		ApiBasics a3 = new ApiBasics();
		a3.readDataFromDb();
		a3.setUserName("Raveen");
		a3.setPassWord("Raveen@104");
		
		System.out.println("====User Defined List====");
		// UserDefined List, Set, Map
		List<ApiBasics> li = new ArrayList<>();
		li.add(a);
		li.add(a1);
		li.add(a2);
		li.add(a3);

		for (int i = 0; i < li.size(); i++) {
			ApiBasics apiBasics = li.get(i);
			apiBasics.setBalance(1);
			System.out.println(apiBasics.getBalance());

		}
		System.out.println();
		
		System.out.println("====User Defined Set====");
		// Set
		Set<ApiBasics> se = new LinkedHashSet<>();
		se.add(a);
		se.add(a1);
		se.add(a2);
		se.add(a3);

		for (ApiBasics s1 : se) {
			s1.setBalance(1);
			System.out.println(s1.getBalance());
		}
		System.out.println();
		
		System.out.println("====User Defined Map====");
		// Map
		Map<Integer, ApiBasics> m = new LinkedHashMap<>();
		m.put(10, a);
		m.put(20, a1);
		m.put(30, a2);
		m.put(40, a3);

		Collection<ApiBasics> values = m.values();
		for (ApiBasics s1 : values) {
			s1.setBalance(1);
			System.out.println(s1.getBalance());
		}

	}

}
