package com.sample.pro;

class Thread1 extends Thread{
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i+" Thread1 is going to sleep");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i+" Thread1 is running");
		}
	}
}

class Thread2 extends Thread{
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i+" Thread2 is going to sleep");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i+" Thread2 is running");
		}
	}
}
public class Loop extends Thread{
	public static void main(String[] arga) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
	}
}
