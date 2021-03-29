package com.jar.implementation;

class BinarySearch {
	// Returns index of x if it is present in arr[l..
	// r], else return -1
	int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;

			// If the element is present at the
			// middle itself
			if (arr[mid] == x)
				return mid;

			// If element is smaller than mid, then
			// it can only be present in left subarray
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);

			// Else the element can only be present
			// in right subarray
			return binarySearch(arr, mid + 1, r, x);
		}

		// We reach here when element is not present
		// in array
		return -1;
	}

	// Driver method to test above
	public static void main(String args[]) {
		BinarySearch ob = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 10;
		int result = ob.binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);

		
		// Using simple loop
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < a.length; i++) {
			System.out.print("\t" + a[i]);
		}
		System.out.println();
		int key = 9;

		int low = 0, high = a.length - 1;
		while (low <= high) {
			System.out.println("HIGH : " + high);
			System.out.println("LOW : " + low);
			int mid = (low + high) / 2;
			System.out.println("MIDDLE : " + mid);
			if (a[mid] == key) {
				System.out.println("Found at : " + mid);
				break;
			} else if (key > a[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
	}
}
