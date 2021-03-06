package com.jar.implementation;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = { 3, 2, 4, 1, 9, 6, 5 };
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		Sort(a);
		System.out.println("");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

	public static void Sort(int a[]) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				if (a[j] < a[j - 1]) {
					int tmp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = tmp;
				}
			}
		}
	}
}
