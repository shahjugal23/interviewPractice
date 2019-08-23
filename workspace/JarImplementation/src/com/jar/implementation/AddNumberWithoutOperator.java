package com.jar.implementation;

public class AddNumberWithoutOperator {

	public static void main(String[] args) {
		int x = 3, y=2;
		System.out.println("Binary of x is "+ Integer.toBinaryString(x));
		System.out.println("Binary of y is "+ Integer.toBinaryString(y));
	
		
		while(y!=0){
			int carry = x & y;  // AND always gives us the carry of 2 bits.
			System.out.println("Carry : "+ carry);
			
			x = x ^ y; // XOR always gives us the sum of 2 bits.
			System.out.println("X ^ Y :"+ x);
			
			y =  carry << 1; // 
			System.out.println("Shifting the carry : "+ y);
		}
		System.out.println("Sum is "+ x);
	}
}