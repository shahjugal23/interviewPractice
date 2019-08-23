package com.jar.implementation;

public class FrequencyCountArray {

	static final int MAX_CHAR = 256;

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4};
		a[0]++;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		getOccuringChar("1222113455");
	}

	public static void getOccuringChar(String str) {
		// Create an array of size 256 i.e. ASCII_SIZE
		int count[] = new int[MAX_CHAR];

		int len = str.length();

		// Initialize count array index
		for (int i = 0; i < len; i++) {
			System.out.println("+++ " + str.charAt(i));
			count[str.charAt(i)]++;
			System.out.println("*** " + count[str.charAt(i)]);
		}
		for (int i = 0; i < len; i++)
			System.out.println("HHHHH" + count[str.charAt(i)]);

		// Create an array of given String size
		char ch[] = new char[str.length()];

		for (int i = 0; i < len; i++) {
			ch[i] = str.charAt(i);
			System.out.println("THe character is : "+ch[i]);
			int find = 0;
			for (int j = 0; j <= i; j++) {

				// If any matches found
				if (str.charAt(i) == ch[j])
					find++;
			}

			if (find == 1)
				System.out.println("Number of Occurrence of " + str.charAt(i) + " is:" + count[str.charAt(i)]);
		}
	}
}
