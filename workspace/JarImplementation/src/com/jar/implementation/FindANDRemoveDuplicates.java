package com.jar.implementation;

public class FindANDRemoveDuplicates {

	public static void main(String[] args) {
//		int a[] = {1,1,1,2,2,2,2,3,3,3,3,3,4,4,4,5,5,5,5,6,6,6,6,6,7};
		int a[] = {1,1,2,3,3};
		int n = a.length; //n =5
		findDuplicate(a);
		n = removeDup(a, n);
		System.out.println(n);
		for (int i=0; i<n; i++) 
	           System.out.print(a[i]+" ");		
	}

	private static void findDuplicate(int[] a) {
		int count=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j])
					count++;
			}
			System.out.println("Count: "+count);
			if(count==1)
				System.out.println("Duplicate: "+a[i]);
			count=0;
		}
	}

	public static int removeDup(int a[], int n){
		int j = 0;
		for(int i=0; i<n-1;i++){ // 0 - 3 // Compress string
			if(a[i]!=a[i+1]){
				a[j] = a[i];
				j++;
			}
		}
		a[j++] = a[n-1]; // a[2] = a[4]
		
		return j;
	}
}
