package com.jar.implementation;

public class CommonElementIn3Arrays {

	public static void main(String[] args) {
		System.out.println("Common elements in 3 Sorted arrays");

		int ar1[] = { 1, 5, 10, 20, 40, 80 };
		int ar2[] = { 6, 7, 20, 80, 100 };
		int ar3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };
		int i = 0, j = 0, k = 0;
		while (i < ar1.length && j < ar2.length && k < ar3.length) {
			System.out.println("I, J , K : " + ar1[i] + ", " + ar2[j] + ", " + ar3[k]);
			if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
				System.out.println("Element : " + ar1[i]);
				i++;
				j++;
				k++;
			} else if (ar1[i] < ar2[j])
				i++;
			else if (ar2[j] < ar3[k])
				j++;
			else
				k++;

		}

	}

}
