package com.jar.implementation;

public class IndexofTarget {
// Also check Leet code site submissions.
	public static void main(String[] args) {
		int target = 9;
		int arr[] = {9,1,2,3,0,4,5,6,7,8,9};
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j]==target)
					System.out.println("The sum of the values at "+i+"("+arr[i]+")"+" and "+j+"("+arr[j]+")"+" is equal to the target value of "+target);
			}
		}
		
	}

}
