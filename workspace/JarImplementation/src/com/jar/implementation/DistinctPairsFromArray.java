package com.jar.implementation;

import java.util.Arrays;

public class DistinctPairsFromArray {

	public static void main(String[] args) {
		int a[] = { 12, 1, 13, 0, 4, 9, 5, 8, 7, 6 };
		int key = 13;
		int pairCnt = 0;
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print("\t" + a[i]);
		}
		System.out.println();
		int i = 0, j = a.length - 1;
		while (i < j) {
			if (a[i] + a[j] == key) {
				while (i < j && a[i] == a[i + 1]) {
					i++;
				}
				while (i < j && a[j] == a[j - 1]) {
					j--;
				}
				pairCnt++;

				i++;
				j--;
			} else if (a[i] + a[j] < key) {
				i++;
			} else {
				j--;
			}
		}
		System.out.println("Number of Unique pairs : " + pairCnt);
	}
}