package com.sample.pro;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapping {
	public static void main(String[] args) {
		Map <Integer,String> m = new TreeMap<Integer,String>();
		m.put(3, "Apple");
		m.put(5, "Orange");
		m.put(1, "Kiwi");
		m.put(4, "PineApple");
		m.put(2, "Mango");
		System.out.println(m);
	}
}
