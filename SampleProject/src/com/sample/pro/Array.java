package com.sample.pro;

class ValueLessThanOneException extends Exception{
	ValueLessThanOneException(String s){
		System.out.println("Value should be greater than one");
	}
}
public class Array {
	public static void main(String[] args) {
		int a[][] = {{0,1},{2,-1,5},{4,7,-1}} ;
		int sum = 0;
		for(int i=0;i<a.length;i++) {//i=1
			int max = a[i][0];
			for(int j=a[i].length-1;j>=0;j--) {
				try {
					if(a[i][j]<0) {
						throw new ValueLessThanOneException("Error");
					}
				}
				catch(ValueLessThanOneException e) {
					System.out.println("Exception : "+e);
					break;
				}
				System.out.print(a[i][j]+" ");
				sum = sum + a[i][j];
				if(max<a[i][j]) {
					max = a[i][j];
				}
			}
			System.out.println("Sum is : "+sum);
			System.out.println("Largest number is : "+max);
			sum = 0;
		}
	}
}
