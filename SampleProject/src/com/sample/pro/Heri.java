package com.sample.pro;

class Animal{
	void eat() {
		System.out.println("Food");
	}
}
class Dog extends Animal{
	void barh() {
		System.out.println("Bark");
	}
}
public class Heri {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.barh();
		d.eat();
	}
}
