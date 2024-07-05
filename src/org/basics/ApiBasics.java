package org.basics;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.io.FileUtils;

public class ApiBasics {
	
	Map<String, Integer> m= new LinkedHashMap<>();
	
	private String userName;
	
	private String passWord;
	
	private int balance;
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		if (userName.equals("Praveen")) {
			this.userName = "Praveen Account";
			
		}
		 else if (userName.equals("Naveen")) {
			this.userName="Naveen Account";
			
		} 
		 else if (userName.equals("Raveen")) {
			this.userName="Raveen Account";
			
		} 
		 else {
				this.userName="Invalid Account";
			
		}
	}
	
	public String getPassWord() {
		return passWord;
	}
	
	public void setPassWord(String passWord) {
		if (passWord.equals("Praveen@101")&& userName.equals("Praveen Account")) {
			this.passWord = "Praveen Account is Stable";
		}
		
		else if (passWord.equals("Naveen@102")&& userName.equals("Naveen Account")) {
			this.passWord = "Naveen Account is Stable";
		}
		
		else if (passWord.equals("Raveen@103")&& userName.equals("Raveen Account")) {
			this.passWord = "Raveen Account is Stable";
		}else {
			this.passWord="Invalid Account";
		}
	}
	
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		
		Set<Entry<String,Integer>> entrySet = m.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (this.passWord.equals(entry.getKey())) {
				this.balance = entry.getValue();
				
			}
			
		}
		
	}
	
	public void readDataFromDb() throws IOException {
		File f= new File("C:\\Users\\lenovo\\eclipse-workspace\\ApiBasics\\resource\\ApiDemo.txt");
		List<String> readLines = FileUtils.readLines(f);
		String string = readLines.get(0);
		String[] split = string.split(",");
		m.put("Praveen Account is Stable", Integer.parseInt(split[2]));
		String string2 = readLines.get(1);
		String[] split2 = string2.split(",");
		m.put("Naveen Account is Stable", Integer.parseInt(split2[2]));
		String string3 = readLines.get(2);
		String[] split3 = string3.split(",");
		m.put("Raveen Account is Stable", Integer.parseInt(split3[2]));

	}
}
