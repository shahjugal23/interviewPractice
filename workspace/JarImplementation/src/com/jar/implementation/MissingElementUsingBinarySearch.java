package com.jar.implementation;

public class MissingElementUsingBinarySearch {

	public static void main(String[] args) {
		int a[] = {1,3,4,5,6,7,8,9,10};
//		int a[] = {1,2,3,4,6,7,8,9,10};
//		int a[] = {1,2,3,4,5,6,8,9,10};

		int n = a.length;

		int low = 0, mid = 0, high = n - 1;
		
		while (low <= high) { // 9 > 0
			mid = (high + low) / 2; // 4 ; 7
			System.out.println("HIGH = "+ high);
			System.out.println("LOW = "+ low);
			System.out.println("MID = "+ mid);
			System.out.println("**********");
			
			if(a[mid] == mid +1)
			{
				low = mid +1;
			}
			else if(a[mid] != mid+1)
			{
				high = mid -1;
			}
		}
		int missing = low +1;
		System.out.println("Missing element is : "+ missing);

		// 1,2,3,4,5

		// a[0] = 1 ., a[4] = 5
		// target = a[0] + a[n-1] == targer -> 11

// low 0, high 9, mid - 4 
		// int a[] = {1,2,3,4,5,6,7,8,9,10};
//		int key = 7;
//		
//		int high = a.length-1, low =0;
//		
//		while(high>=low) {
//			
//			int mid = (high + low)/2;
//			
//			if(a[mid] == key) {
//				System.out.println("Key found at :"+ mid);
//				break;
//			}
//			else if(key > a[mid])
//				low = mid +1;
//			else if (key<a[mid])
//				high = mid -1;
//			
//			System.out.println("HIGH ="+ high);
//			System.out.println("LOW ="+ low);
//			System.out.println("MID ="+ mid);
//			
//		}
//		if(low>high)
//			System.out.println("Key not present");

	}

}
