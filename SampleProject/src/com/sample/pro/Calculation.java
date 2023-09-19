package com.sample.pro;

public class Calculation {
	public void add(int a, int b) {
		int c = a+b;
		System.out.println("Overriding Addition : "+c);
	}
	public void sub(int a, int b) {
		int c = a-b;
		System.out.println("Overriding Subtraction : "+c);
	}
	public static void main(String[] args) {
		
	}
}
