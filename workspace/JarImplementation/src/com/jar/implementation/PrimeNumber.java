package com.jar.implementation;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 29;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Number " + n + " is prime number");
		} else {
			System.out.println("Number " + n + " is not prime number");
		}

		// Range
		for (int j = 1; j <= 30; j++) {
			int cnt = 0;
			for (int k = 1; k <= j; k++) {
				if (j % k == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				System.out.println("Prime Number : " + j);
			}
		}
		
		// Flags and half 
		int num = 37; 
		System.out.println("num/2 = "+ num/2);
		boolean flag= true;
		for(int i = 2; i<= num/2; i++){
			if(num%i == 0){
				flag = false;
				break;
			}
		}
		if(flag){
		System.out.println("NUMBER:"+num+" is prime.");
		}
		else{
			System.out.println("NUMBER:"+num+ " is not prime");
		}
		}

}
