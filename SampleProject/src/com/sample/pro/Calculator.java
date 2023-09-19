package com.sample.pro;

public class Calculator {
	public int add(int a,int b) {
		return (a+b);
	}
	public int add(int a,int b,int c) {
		return(a+b+c);
	}
	public int sub(int a, int b) {
		return(a-b);
	}
	public int div(int a, int b) {
		return(a/b);
	}
	public int mul( int a, int b) {
		return(a*b);
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.add(10, 50));
		System.out.println(cal.add(20, 60, 40));
		System.out.println(cal.sub(20, 10));
		System.out.println(cal.div(30, 5));
		System.out.println(cal.mul(5, 4));
	}
}
