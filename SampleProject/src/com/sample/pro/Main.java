package com.sample.pro;


class Parent {
	 public void Print()
	    {
	        System.out.println("Parent");
	    }
	}
	 
	class Child extends Parent {
	    public void Print()
	    {
	        System.out.println("Child");
	    }
	}
public class Main {
	 public static void main(String[] args)
	    {
	        Parent x = new Parent();
	        Parent y = new Child();
	        Child z = new Child();
	       y.Print();
	    }
}
