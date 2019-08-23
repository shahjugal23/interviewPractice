package com.jar.implementation;

public class AmazonSegregateArray {

	public static void main(String[] args) {
		int a[]= {1,1,1,1,1,1,2,2,2,2,2,2,0,0,1,1,1,2,2,2};
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		int len_0 =0, len_1=0, len_2 = 0;
		for(int i=0; i<a.length;i++){
			if(a[i]==0)
				len_0++;
			else if(a[i]==1)
				len_1++;
			else if(a[i]==2)
				len_2++;
		}
		System.out.println("\nLen 0 :"+ len_0+"  Len_1 : "+len_1+"  Len 2 : "+len_2);
		for(int i = 0 ; i<len_0; i++){
			a[i]=0;
		}
		for(int i = len_0 ; i<len_1; i++){
			a[i]=1;
		}
		for(int i = len_1 ; i<a.length; i++){
			a[i]=2;
		}
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		
		
		System.out.println("\nUsing a single pass!");
		int a1[] = {0,1,0,1,1,1,1,0,0,0,0};
		int j=0;
		for (int i = 0; i < a1.length; i++) {
			if(a1[i]==0){
				int temp = a1[j];
				a1[j]= a1[i];
				a1[i]=temp;
				j++;
			}
		}
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i]+" ");
		}
	}

}
