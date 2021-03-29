	package com.jar.implementation;

public class PowerFunction {

	public static void main(String[] args) {
		System.out.println(power(2,-3));
		//System.out.println("Factorial of :" +6+" is :"+ factorial(6));
	}
	public static double power(double x, double n){
		double result =1.0;
		
		if(n==0){
			result =1.0;
		}
		else if(n<0) {
			while(n!=0){
				result = result / x;
				n++;
			}
		}
		else if(n>0){
		while(n!=0){
			
			result = result*x;
			n--;
		}
		}
		return result;
	}

	public static int factorial(int x){
		if(x == 0){
			return 1;
		}
		else{
			return(x * (factorial(x-1)));
		}
	}
	
}
