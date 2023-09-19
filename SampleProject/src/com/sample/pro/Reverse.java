package com.sample.pro;

public class Reverse {
	public static void main(String[] args) {
		String name = "Srinath";
		for(int i = name.length()-1;i>=0;i--) {
			char ch = name.charAt(i);
			System.out.print(ch);
		}
	}
}
