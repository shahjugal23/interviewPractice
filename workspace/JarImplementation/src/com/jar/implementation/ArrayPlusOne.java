package com.jar.implementation;

public class ArrayPlusOne {

	public static void main(String[] args) {
		int data[] = {1,9,9,9};
		PrintArray(data);
		int data1[] = plusOne(data);
		PrintArray(data1);
		
		int egArray[] = new int[4];
		egArray[0] =7;
		PrintArray(egArray);// By default 0 is stored.
		
	}
	public static void PrintArray(int a[]){
		
		for(int i =0 ; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static int[] plusOne(int[] digits) {
        
	    int n = digits.length;
	    for(int i=n-1; i>=0; i--) {
	        if(digits[i] < 9) 
	        {
	            digits[i]++;
	            return digits;
	        }
	        
	        digits[i] = 0;
	    }
	    
	    int[] newNumber = new int [n+1];
	    newNumber[0] = 1;
	    return newNumber;
	}
}
