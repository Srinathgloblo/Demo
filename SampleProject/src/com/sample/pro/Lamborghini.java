package com.sample.pro;

public class Lamborghini extends Ferrari{
	public void company() {
		System.out.println("Company Name : Lamborghini");
	}
	public void model() {
		System.out.println("Model Name : Lamborghini Aventador");
	}
	public void price() {
		System.out.println("Cost : Rs. 5.62 Crores");
	}
	public void speed() {
		System.out.println("Top Speed : 350 km/h or 217.5 mph");
	}
	public static void main(String[] args) {
		Ferrari f = new Ferrari();
		Lamborghini l = new Lamborghini();
		Ferrari fa = new Lamborghini();
		/*l.company();
		f.company();
		f.model(1);
		f.model('A');
		l.model();
		l.speed();
		l.price();*/
	}
}
