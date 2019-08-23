package com.jar.implementation;

public class MaxProductArray {

	public static void main(String[] args) {
		int a[] = {6, -3, -10, 0, 2};
		int len = a.length;
		MaxProduct(a, len);
		SecondLargest(a, len);
		SecondSmallest(a, len);
	}

	public static void MaxProduct(int a[], int n) {
		int x = a[0];
		int y = a[1];
		
		for(int i =0; i<n; i++){
			for(int j =i+1; j<n; j++){
			if(a[i]*a[j] > x*y){
				x= a[i];
				y=a[j];
			}
			}
		}
		System.out.println("The pair is  : "+ x +" "+ y);
	}
	
	public static void SecondLargest(int a[], int n){

		int first , second;
		first=second= Integer.MIN_VALUE;
		
		for(int i = 0; i < n ; i++){
			if(a[i] > first){
				second = first;
				first = a[i];
			}
			else if(a[i] > second && a[i]!=first){
				second =a[i];
			}
		}
		System.out.println("First largest: "+first+"\nSecond Largest : "+second);
		
	}
	
	public static void SecondSmallest(int a[],int n){
		int first, second ;
		first = second = Integer.MAX_VALUE;
		
		for(int i =0 ; i<n; i++){
			if(a[i] < first){
				second = first;
				first = a[i];
			}
			else if(a[i]<second && a[i] != first){
				second = a[i];
			}
		}
		System.out.println("First smallest: "+ first+"\nSecond Smallest : "+second);
	}
}
