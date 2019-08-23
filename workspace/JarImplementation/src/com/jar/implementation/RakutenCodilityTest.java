package com.jar.implementation;

import java.util.ArrayList;
import java.util.List;

public class RakutenCodilityTest {
//return shortest sequence of bits - Google query
	public static void main(String[] args) {

		int a[]= {1,0,0,1,1,1};
		double x = findX(a);
		System.out.println("The value of X is : "+x);
		int ceiling = (int)Math.ceil(x/2);
		System.out.println("The ceiling value for "+x+" is : "+ ceiling);
		System.out.println("The List is:: \n"+negativeBase(ceiling,-2));
	}

	private static double findX(int[] a) {
		double X=0;
		for(int i=0; i< a.length; i++)
		{
			X = (X + (a[i] * Math.pow(-2, i)));
		}
		return X;
		
	}
	public static List<Integer> negativeBase(int integer, int base) {
        List<Integer> digits = new ArrayList<>();
        while (integer != 0) {
            int i = integer % base;
            integer /= base;
            if(i < 0) {
                i += Math.abs(base);
                integer++;
            }
            digits.add(0, i);
        }
        return digits;
    }

}
