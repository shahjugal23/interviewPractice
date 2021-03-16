package com.jar.implementation;


/*
 * Refer https://www.geeksforgeeks.org/java-program-for-longest-common-subsequence/
 * 
 * 
 */
public class StringConversionOracle {
	static int lcs(String str1, String str2, int m, int n) {
		int L[][] = new int[m + 1][n + 1];
		int i, j;

		// Following steps build L[m+1][n+1] in
		// bottom up fashion. Note that L[i][j]
		// contains length of LCS of str1[0..i-1]
		// and str2[0..j-1]
		for (i = 0; i <= m; i++) {
			for (j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					L[i][j] = 0;

				else if (str1.charAt(i - 1) == str2.charAt(j - 1))
					L[i][j] = L[i - 1][j - 1] + 1;

				else
					L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
			}
		}

		// L[m][n] contains length of LCS
		// for X[0..n-1] and Y[0..m-1]
		return L[m][n];
	}

	// function to find minimum number
	// of deletions and insertions
	static void printMinDelAndInsert(String str1, String str2) {
		int m = str1.length();
		int n = str2.length();

		int len = lcs(str1, str2, m, n);

		System.out.println("Minimum number of " + "deletions = ");
		System.out.println(m - len);

		System.out.println("Minimum number of " + "insertions = ");
		System.out.println(n - len);
	}

	// Driver code
	public static void main(String[] args) {
		String str1 = new String("saturday");
		String str2 = new String("sunday");

		// Function Call
		printMinDelAndInsert(str1, str2);

		
		// When both strings are of same length
		String A = "EACBD";
		String B = "EABCD";

		System.out.println("Minimum number of " + "operations required is " + minOps(A, B));
	}

	public static int minOps(String A, String B) {

		// This parts checks whether conversion is
		// possible or not
		if (A.length() != B.length())
			return -1;

		int i, j, res = 0;
		int count[] = new int[256];

		// count characters in A

		// subtract count for every character in B
		for (i = 0; i < A.length(); i++) {
			count[A.charAt(i)]++;
			count[B.charAt(i)]--;
		}

		// Check if all counts become 0
		for (i = 0; i < 256; i++)
			if (count[i] != 0)
				return -1;

		i = A.length() - 1;
		j = B.length() - 1;

		while (i >= 0) {
			// If there is a mismatch, then
			// keep incrementing result 'res'
			// until B[j] is not found in A[0..i]
			if (A.charAt(i) != B.charAt(j))
				res++;
			else
				j--;
			i--;
		}
		return res;
	}
}
