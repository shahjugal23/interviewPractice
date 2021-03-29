package com.jar.implementation;

public class SubArrayMatchingSum {

	public static void main(String[] args) {
		int a[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
		int target = 33;
		int currentSum = 0;
		for (int i = 0; i < a.length; i++) {
			currentSum = a[i];
			for (int j = i + 1; j < a.length; j++) {
				currentSum += a[j];
				if(currentSum==target)
				{
					System.out.println("Sum found between index :"+ i + " & " + j);
					break;
				}
				if(currentSum>target)
					break;
			}
		}
	}
}
