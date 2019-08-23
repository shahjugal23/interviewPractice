package com.jar.implementation;

public class AmazonStringCommon {

	public static void main(String[] args) {
		String a = "string";
		String b = "strong";
		char[] m = a.toCharArray();
		char[] n = b.toCharArray();
		
		for(int i = 0; i<m.length; i++){
			for(int j =0; j<n.length; j++){
				if(m[i]==n[j])
					System.out.print(m[i]);
			}
		}
		System.out.println("\nReverse is :"+ReverseString("12345"));
		String s = "a!!!b.c.d,e'f,ghi";
		System.out.println("Original string is: "+s);
		char arr[] = s.toCharArray();
		StringReverse(arr);
		String newRev= new String(arr);
		System.out.println("Reverse string is :" + newRev);
		char z = 'A';
		int ascii = 'a';
		System.out.println("Ascii value of A is : "+ ascii); // Can use this logic to check if its a alphabet
		// 97 - 122  --> a-z
		// 65 - 90  --> A-Z
		String a1 = "1234543211";
		checkPalindrome(a1);
	}
	public static String ReverseString(String str)
	{
		char[] a = str.toCharArray();
		String s = "";
		for(int i = a.length-1 ; i>=0; i--){
			s= s+a[i];
		}
		return s;
	}
	
	public static void StringReverse(char arr[]){
		
		int l = 0;
		int r = arr.length -1;
		System.out.println("R"+r);
		
		while(l<r)
		{
			if(!Character.isAlphabetic(arr[l])){
				l++;
			}
			else if(!Character.isAlphabetic(arr[r])){
				r--;
			}
			else
			{
				char tmp = arr[l];
				arr[l]= arr[r];
				arr[r]=tmp;
				l++;
				r--;
			}
		}
	}
		public static void checkPalindrome(String a){
			boolean flag = true;
			
			int l =0;
			int r = a.length() -1;
			while(l<r){
				if(a.charAt(l++)!=a.charAt(r--)){
					flag=  false;
				}
			}
			if(flag)
			System.out.println("String is a palindrome.");
			else
				System.out.println("Not a palindrome");
			
			
		}

}
