package com.jar.implementation;

public class Merge2SortedArrays {

	public static void main(String[] args) {
		int a1[] = {1,3,5,7,9};
		int a2[] = {6,8,10};
		printArray(a1);
		printArray(a2);
		merge2arrays(a1,a2);
	}

	
	public static void merge2arrays(int[] a1, int[] a2) {
		int l1 = a1.length;
		int l2 = a2.length;
		
		int a3[] = new int[l1+l2];
		
		int i=0,j=0,k=0;
		
		
		while(i<l1 && j<l2){
			if(a1[i] < a2[j])
				a3[k++] = a1[i++];
			else
				a3[k++] = a2[j++];
		}
		
		while(i<l1)
			a3[k++]=a1[i++];
		
		while(j<l2)
			a3[k++]=a2[j++];
		
		
		
		
		printArray(a3);
	}


	static void printArray(int a[])
	{
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
