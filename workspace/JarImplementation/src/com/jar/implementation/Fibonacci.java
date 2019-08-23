package com.jar.implementation;

public class Fibonacci {

	public static void main(String[] args) {
		int a = 0, b = 1;
		System.out.println(a + "\n" + b);
		int arr[] = new int[10];
		arr[0] = a;
		arr[1] = b;
		for (int i = 1; i < 10; i++) {
			int sum = a + b;
			a = b;
			b = sum;
			System.out.println(sum);
		}
		int k = 10;
		int l = 20;
		System.out.println("K:" + k + "L:" + l);
		k = k + l; // k =30
		l = k - l; // 30-10 -> 20
		k = k - l; //
		System.out.println("K:" + k + "L:" + l);

		a = 55;
		b = 34;
		for (int i = 9; i > 0; i--) {
			int diff = a - b;
			a = b;
			b = diff;
			System.out.println(diff);
		}
		
		int n = 7;
		printFibonacci(n);
	}

	private static void printFibonacci(int n) {

		int arr[] = new int[n];
		arr[0]=0;
		arr[1]=1;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-1]+arr[i-2];
		}
		System.out.println("The fibonacci series in correct order is :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("\t"+arr[i]);
		}
		System.out.println("\nThe fibonacci series in REVERSE order is :");
		for(int i= n-1; i>=0;i--)
			System.out.print("\t"+arr[i]);
		
	}
}
