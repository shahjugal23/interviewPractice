package com.jar.implementation;

/*
 * An array is given of n length, and we need to 
 * calculate the next greater element for each element in the given array.
 * If the next greater element is not available in the given array, then we need to fill ‘0’ at that index place
Input :  6 3 9  8 10 2 1 15 7 
Output : 7 6 10 9 15 3 2 0  8
 * 
 */
public class NextGreaterNumber {

	public static void main(String[] args) {
		
		int a[] = {6, 3, 9, 8, 10, 2, 1, 15, 7 };
		
		for(int i=0; i<a.length; i++) {
			int n = Integer.MAX_VALUE; 
			for(int j=0; j<a.length; j++) {
				if(a[i]<a[j] && a[j]< n) 
				{
					n = a[j]; //9
				}
			}
			if(n==Integer.MAX_VALUE)
				n=0;
			System.out.println(" "+ n);
			
		}
	}
}
