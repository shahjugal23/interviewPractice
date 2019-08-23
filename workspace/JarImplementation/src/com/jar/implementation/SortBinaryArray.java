package com.jar.implementation;

public class SortBinaryArray {

	public static void main(String[] args) {
//		int a[]= {0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1};
		int a[]= {0,0,1,0,1,0,0,1,1,1,1,1,1};
		System.out.println("The array before sorting is ----");
		printArray(a);
		System.out.println("\nThe array after sorting is ----");
		int i,j=0;
		for(i=0; i<a.length; i++){
			if(a[i]==0){
				int temp = a[i];
				a[i] = a[j];
				a[j]= temp;
				j++; // Check positive occurrence, RemoveDuplicate
			}
		}
		printArray(a);
	}
	public static void printArray(int a[]){
		for(int i =0 ; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
	}
}
