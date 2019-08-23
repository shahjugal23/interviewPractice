package com.jar.implementation;

public class ReverseDigits {

	public static void main(String[] args) {
		int n = -321, reverse = 0;
		int original = n;
		boolean flag=false;
		if(n<0)
		{
			n = n * (-1);
			flag =true;
		}
		while(n!=0){
			int d = n %10;
			System.out.println(d);
			reverse = reverse * 10 + d;
			System.out.println("r:"+reverse);
			n = n/10;	
		}
		
		if(flag)
			reverse = 0 - reverse;
		
		System.out.println("The reverse number is :"+reverse);
		
		if(reverse == original){
			System.out.println("Its a palindrome!!!");
		}
		else{
			System.out.println("Not a palindrome!!!");
		}
	}

}
