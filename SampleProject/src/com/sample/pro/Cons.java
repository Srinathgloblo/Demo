package com.sample.pro;

import java.util.Scanner;

public class Cons {
	public Cons() {
		this(100);
		System.out.println("Normal");
	}
	public Cons(int a) {
		this("Srinath");
		System.out.println("Int : "+a);
	}
	public Cons(String a) {
		this('B');
		System.out.println("String : "+a);
	}
	public Cons(int a, int b) {
		int sum = a+b;
		System.out.println("Addition : "+sum);
	}
	public Cons(char b) {
		this(40,50);
		System.out.println("Char : "+b);
	}
	public static void main(String[] args) {
		Cons c = new Cons();
	}
}
