package com.jar.implementation;

public class IfCondition {

	public static void main(String[] args) {
		int i =10;
		try{
			if(i==11)
				System.out.println("Inside Try and IF");
		}
		catch(Exception e){
			System.out.println("Inside the catch block.");
		}
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}

}
