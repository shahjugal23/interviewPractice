package com.jar.implementation;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int x = 1634 ;
		int o = order(x);
		System.out.println("The order is : "+o);
//		PowerFunction pf = new PowerFunction();
		int temp = x , sum =0;
		while(temp!=0){
			int rem = temp % 10;
			sum = (int) (sum + Math.pow(rem, o));
			temp = temp /10;
			System.out.println("Sum : "+sum);
		}
		
		if(sum == x){
			System.out.println("Its an armstrong number!");
		}
		else{
			System.out.println("Its not an armstrong number!");
		}
	}

	public static int order(int x){
		int n =0;
		while(x!=0){
			x = x/10;
			n++;
		}
		return n;
	}
}
