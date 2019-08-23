package com.jar.implementation;

import java.util.Arrays;

public class EqualArrays {

	public static void main(String[] args) {
		int a[]={1,3,5,2};
		int b[]={3,8,2,5};
		
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println("Array 1:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\nArray 2:");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		boolean flag=true;
		if(a.length==b.length){
			for (int i = 0; i < a.length; i++) {
				if(a[i]!=b[i]){
					flag=false;
				}
			}
		}
		else{
			flag=false;
		}
		if(flag)
			System.out.println("\nArrays are equal!");
		else
			System.out.println("\nArrays are not equal!");
	}

}
