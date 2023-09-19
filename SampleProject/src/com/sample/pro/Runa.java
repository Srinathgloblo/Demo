package com.sample.pro;

public class Runa implements Runnable{
	public void sprint() {
		for(int i=1;i<=5;i++) {
			System.out.println(i+1+"First");
		}
	}
	public void run() {
		for(int i=5;i>=1;i--) {
			System.out.println(i-1+"Second");
		}
	}
	public static void main(String[] args) throws InterruptedException{
		Runa r = new Runa();
		Thread t = new Thread(r);
		Thread t1 = new Thread(r);
		r.sprint();
		t.run();
	}
}
