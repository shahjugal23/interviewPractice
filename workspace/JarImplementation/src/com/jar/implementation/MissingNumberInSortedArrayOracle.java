package com.jar.implementation;

/*
 * 	
 * https://www.geeksforgeeks.org/find-the-missing-number-in-a-sorted-array/
 */
public class MissingNumberInSortedArrayOracle {
	static int search(int ar[], int size) {
		int low = 0, high = size - 1;
		int mid = 0;
		while ((high - low) > 1) {
			mid = (low + high) / 2;
			if ((ar[low] - low) != (ar[mid] - mid))
				high = mid;
			else if ((ar[high] - high) != (ar[mid] - mid))
				low = mid;
		}
		return (ar[mid] + 1);
	}

//Driver Code 
	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5, 6, 8 };
//		int ar[] = { 1, 3, 4};
		int size = ar.length;
		System.out.println("Missing number: " + usingSum(ar));
	}

	static int binsearch(int a[]) {

		int high = a.length - 1;
		int low = 0;

		while (low < high) {
		}

		return 0;
	}

	public static int usingSum(int a[]) {
//	       int a[] = {1, 2, 3, 5, 6, 7};
		for (int i = 0; i < a.length; i++) {
			System.out.print("\t" + a[i]);
		}
		System.out.println();

		int n = a.length;
		System.out.println("length  : " + n);
		int expectedSum = ((n + 2) * (n + 1)) / 2; 
		// Ideally we get the progression using n (n+1) /2. We know that 1 element is missing so we calculate the sum for the next element
		// that time we replace n with n + 1. So we get (n+1) (n+2) /2. Doing that helps us get the sum of the actual series without missing elements.

		System.out.println("Expected Sum : " + expectedSum);
		int actualSum =0;
		for (int i = 0; i < n; i++) {
			actualSum = actualSum + a[i];
		}
		System.out.println("Actual Sum : " + actualSum);
		int missing = expectedSum - actualSum;
		System.out.println("Missing element is : " + missing);
		return missing;
	}
}
