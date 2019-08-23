package com.jar.implementation;

public class SquareRootFunction {

	public static void main(String[] args) {
		int x = 24;
		int sqrt = SquareRoot(x);
		System.out.println("The floor square root is : "+ sqrt);
		
		double actualSquareRoot = Math.sqrt(x);
		System.out.println("The actual square root is : "+ actualSquareRoot);
		
		checkPerfectSquare(x);
		
	}
	private static void checkPerfectSquare(int x) {
		
		int flrSqRt = SquareRoot(x);
		double actualSqRt = Math.sqrt(x);
		
		if( actualSqRt - flrSqRt == 0)
			System.out.println("The number "+x+" is a perfect square!");
		else
			System.out.println("The number "+x+" is not a perfect square!");
		
	}
	private static int SquareRoot(int x) {
		if(x==0 || x==1)
			return x;
		
		int  i=1, result =1;
		
		while(result<=x)
		{
			i++;
			result = i * i;
			/*System.out.println("Result:"+result );
			System.out.println("value of i:"+i);*/
		}
		
		return i-1;
	}

}
