package com.jar.implementation;

public class ReduceNumberToZero {

	public static void main(String[] args) {
		int n = 25;
		
		int steps = 0;
		
		while(n!=0)
		{
			if(n%2==0)
				n = n/2;
			else
				n = n-1;
			steps++;
		}
		System.out.println("Number of steps required : "+ steps);
	}

}
