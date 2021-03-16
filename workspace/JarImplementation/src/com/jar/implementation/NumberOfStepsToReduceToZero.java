package com.jar.implementation;

public class NumberOfStepsToReduceToZero {
	public static int numberOfSteps(int num) {
		int cnt = 0;
		while (num > 0) {
			if (num % 2 == 1)
				num--;
			else
				num /= 2;
			cnt++;
		}
		return cnt;
	}

	public static void main(String[] args) throws java.lang.Exception {
		System.out.print(numberOfSteps(14));
	}
}
