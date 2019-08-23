package com.jar.implementation;

public class ReverseArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8};
		int n = a.length;
		System.out.println("The length of the array is  : "+ n);
		int i=0, j=n-1,t;
		for(int x=0; x<n/2;x++){
			t = a[i];
			a[i]=a[j];
			a[j]=a[i];
			i++;
			j--;
		}
		System.out.println("Reversed array is:"); 
        for (int k = 0; k < n; k++) { 
            System.out.print(a[k]); 
        } 
	}

}
