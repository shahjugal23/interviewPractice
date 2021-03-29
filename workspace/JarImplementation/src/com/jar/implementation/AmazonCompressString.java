package com.jar.implementation;

public class AmazonCompressString {

	public static void main(String[] args) {
		//NEED SORTED ELEMENTS
		//
/*		int a[]= {1,2,2,2,3,3,3,3,3,4,4,4,4,4,5,5,5,5};
		int arr[] = new int[10];
		int count1 =1 , j =0;
		for(int i=0; i<a.length-1; i++){
			if(a[i]==a[i+1]){
				count1++;
			}
			else{
				arr[j]=a[i];
				j++;
				arr[j]= count1;
				j++;
				count1 =1;
			}
		}
		System.out.println("Array is : "+ arr);*/
		
		String str="aaabbbbccdd";
//		String str="aabb";
//		String str="wwwwaaadexxxxxxywww";
		char arr[] =str.toCharArray();
		
		String newstring = "";
		int count1=1, j=0;
		for ( j = 0; j < arr.length-1; j++) {
			if(arr[j]==arr[j+1]){
				count1++;
			}
			else{
				newstring=newstring+arr[j]+count1;
				count1=1;
			}
		}
		newstring=newstring+arr[j]+count1;
		System.out.println(newstring);
	}

}
