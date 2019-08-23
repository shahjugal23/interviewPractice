package com.jar.implementation;

import java.util.Arrays;

public class SortUsingSingleLoop {

	public static void main(String[] args) {

		int a[]={22,8,3,4,6,7,1,21,5,2,9};
		System.out.println("Unsorted Array");
		PrintArray(a);
		Sort(a);
		/*for(int i=0, j=i+1; i<a.length && j<a.length;){
			PrintArray(a);
			if(a[i]>a[j]){
				int tmp = a[i];
				a[i]=a[j];
				a[j]=tmp;
				i=0;
				j=i+1;
			}
			else{
				i++;
				j++;
			}
		}*/
		System.out.println("\nSorted Using Single Loop");
		PrintArray(a);
	}
	public static void PrintArray(int a[]){
		
		for(int i =0 ; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

	public static void Sort(int a[]){
		
		for(int i=0; i<a.length-1; ){
			if(a[i] > a[i+1])
			{
				int t = a[i];
				a[i]=a[i+1];
				a[i+1]=t;
				i--;
				if(i==-1)
					i=0;
			}
			else
				i++;
		}
	}
}
