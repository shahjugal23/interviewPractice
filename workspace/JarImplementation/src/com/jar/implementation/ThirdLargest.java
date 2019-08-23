package com.jar.implementation;

public class ThirdLargest {

	public static void main(String[] args) {
		int a[] = {12,66, 34 ,35, 1, 10, 34, 1 };
		
		int first = a[0];
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		
		for (int i = 1; i < a.length; i++) {
			if(a[i] > first)
			{
				third = second;
				second = first;
				first = a[i];
			}
			else if(a[i]>second && a[i]!=first){
				third = second; 
				second = a[i];
			}
			else if(a[i]>third && a[i]!=first && a[i]!=second){
				third = a[i];
			}
		}
		
		System.out.println("The Third largest elemnt is : "+ third);
	}

}
