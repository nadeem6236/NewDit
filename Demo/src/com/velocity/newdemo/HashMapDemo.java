package com.velocity.newdemo;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, String> contacts = new HashMap<>();
		contacts.put("Nadeem", "9665881110");
		contacts.put("Salik", "9766213068");
		contacts.put("vaibhav", "9284523545");
		 
		HashMap<String, HashMap<String, String>> ctmap=new HashMap<>();
		ctmap.put("Contacts", contacts);
		
		ctmap.forEach((k,v)->System.out.println(k+v));
	
	}

}
