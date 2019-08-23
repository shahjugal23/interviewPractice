package com.jar.implementation;

public class SumInSingleDigit {

	public static void main(String[] args) {
		int n =12345;
		int sum =0;
		while(n!=0 || sum>9){
			if(n==0){
				n= sum;
				sum =0;
			}
			int last_digit = n%10;
			sum+= last_digit;
			n=n/10;
		}
		System.out.println("Sum is : "+sum);
		System.out.println("Normal Sum is : "+Sum(12345));
		int s = Sum(2482);
		while(s>9){
			s = Sum(s);
		}
		System.out.println("The single digit sum of 999 is  : "+s);
	}
	
	
	public static int Sum(int n){
		int sum =0;
		while(n!=0){
			int digit = n%10;
			sum = sum + digit;
			n = n/10;
		}
		return sum;
	}
	
}
