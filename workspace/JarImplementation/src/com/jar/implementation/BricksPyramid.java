package com.jar.implementation;

public class BricksPyramid {

	public static void main(String[] args) {
		
		int a[] = {4,6,9};
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("The pyramid is possible for : "+a[i]+ " " +isPyramid(a[i]));
		}
		
		
	}

	private static boolean isPyramid(int bricks) {
		
		int rowBricks = 1;
		while(bricks > 0) {
			bricks -= rowBricks;
			rowBricks += 2;
		}
		
		return bricks == 0;
	}

}
