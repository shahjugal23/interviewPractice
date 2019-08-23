package com.jar.implementation;

public class MaxNumberInArray {

	public static void main(String[] args) {
		int a[] = { -2, 10, 33, 11111, 1, 4, 9999, 324, 45, 90, -4,9808, 2239232 };
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Max : " + max);

		int min = a[0];
		for (int j = 1; j < a.length; j++) {
			if (a[j] < min) {
				min = a[j];
			}
		}
		System.out.println("Min : " + min);
	}	
	
}