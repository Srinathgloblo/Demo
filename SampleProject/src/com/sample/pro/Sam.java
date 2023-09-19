package com.sample.pro;

import java.util.Scanner;

public class Sam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int in = sc.nextInt();
		int sum=0,count=0;
		int a[] = {1,4,6,7,3,15,20,1,4,6};
		for(int j=0; j<a.length;j++) {
			if(a[j] % in == 0) {
				count++;
			}
		}
			for(int i=0; i<a.length;i++) {
				if(a[i] % in == 0) {
					System.out.println(a[i]);
					sum = sum + a[i];
				}
				else if(count == 0) {
					System.out.println("Invalid");
					break;
				}
			}
		//int avg = sum / count;
		//System.out.println("Average : "+avg);
	}
}
