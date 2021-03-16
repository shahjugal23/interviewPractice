package com.jar.implementation;

import java.util.Random;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		
//		simple2Darray();
		int line = 4;
		int col = 4;
		int myarr[][]=create2Darray(line,col);
		print2Darray(myarr);
		printSnakearray(myarr);
		
	}


	private static void printSnakearray(int[][] myarr) {
		
		System.out.println("SNAKE DISPLAY OF THE ABOVE 2D ARRAY");
		
		for(int i = 0 ; i<myarr.length; i++) {
			if(i%2==0) {
				for(int j=0; j<myarr[i].length; j++) {
					System.out.print("\t"+myarr[i][j]);
				}
			}
			else {
				for(int j= myarr.length-1; j>=0; j--) {
					System.out.print("\t"+myarr[i][j]);
				}
			}
		}
		
	}


	private static int[][] create2Darray(int line, int col) {
		
		Random rndm = new Random();
		
		int arr[][]=new int[line][col];
		for(int i =0; i<line;i++) {
			for(int j=0; j<col; j++) {
				arr[i][j]= rndm.nextInt(100)+1;
			}
		}
		return arr;
		
	}

	private static void print2Darray(int[][] myarr) {
		
		for(int i = 0 ; i<myarr.length; i++) {
			for(int j=0; j<myarr[i].length; j++) {
				System.out.print("\t"+myarr[i][j]);
			}
			System.out.println();
		}
	}

	private static void simple2Darray() {
		int arr[][] = {{1, 2, 3, 4}, 
		        {5, 6, 7}, 
		        {9, 10, 11, 12}, 
		        {13, 14, 15, 16,0,12,23}};
		
		
		int noOfrows = arr.length;
//		int noOfcol = arr[0].length; THE NO OF COLUMNS IS ARBITARY PER ROW.
		
		for(int i= 0; i<noOfrows;i++) {
			
			for(int j=0;j<arr[i].length; j++) {
				System.out.print("\t"+arr[i][j]);
			}
			System.out.println();
		}
	}

}
