package com.jar.implementation;

public class SecondLargest {

	public static void main(String[] args) {
		int arr[] = { 12,66, 34 ,35, 1, 10, 34, 1 };
		int n = arr.length;
				System.out.println(n+"Length");
		print2largest(arr, n);
		SecondLargestnumber(arr,n);
	}
	
	
	

	private static void SecondLargestnumber(int[] arr, int n) {
		
		
		int first = arr[0];
		int second = arr[1];
		
		if(second>first)
		{
			first = first + second; // 10 + 20 -> 30
			second = first -second; // 30 - 20 -> 10
			first = first -second;  // 30 - 20 -> 20
		}
		
		for (int i = 2; i < arr.length; i++) 
		{
			if(arr[i] > first){
				second = first;
				first =arr[i];
			}
			else if(arr[i]>second && arr[i]!=first){
				second = arr[i];
			}
		}
		System.out.println("\nSecond largest number is : "+ second);
	}




	public static void print2largest(int arr[], int arr_size) {
		int i, first, second;

		/* There should be atleast two elements */
		if (arr_size < 2) {
			System.out.print(" Invalid Input ");
			return;
		}

		first = second = Integer.MIN_VALUE;
		for (i = 0; i < arr_size; i++) {
			/*
			 * If current element is smaller than first then update both first
			 * and second
			 */
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			}

			/*
			 * If arr[i] is in between first and second then update second
			 */
			else if (arr[i] > second && arr[i] != first)
				second = arr[i];
		}

		if (second == Integer.MIN_VALUE)
			System.out.print("There is no second largest" + " element\n");
		else
			System.out.print("The second largest element" + " is " + second);
	}
}
