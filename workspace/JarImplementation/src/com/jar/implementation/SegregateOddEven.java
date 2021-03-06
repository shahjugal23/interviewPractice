package com.jar.implementation;

public class SegregateOddEven {

	public static void main(String[] args) {
		int a[]={3,2,1,5,7,8};
		for(int k=0; k<a.length;k++)
			System.out.print(" "+a[k]);
		evenOddPartition(a);
		for(int k=0; k<a.length;k++)
				System.out.print(" "+a[k]);
	}
	
	
	// x%2 == 0 means even
	// x%2 != 0 means odd
	// x & 1 == 0 means even	 0010 & 0001 -> 0000
	// x & 1 != 0 means odd      0011 & 0001 -> 0001
	public static int [] evenOddPartition(int data[]) {
	    int left =0, right = data.length-1;
	    
	    while(left < right){
	    	System.out.print("\n!Left :"+ left+" !Right: "+right);
	    	
	    	while(left < right && (data[left]&1) == 0){
	    		left++;
	    		System.out.print("\nLeft : "+left);
	    	}
	    	while (left < right && (data[right]&1)!=0){
	    		right--;
	    		System.out.print("\nRight : "+right);
	    	}
	    	if (left < right) 
            { 
                /* Swap arr[left] and arr[right]*/
                int temp = data[left]; 
                data[left] = data[right]; 
                data[right] = temp; 
                left++; 
                right--; 
                System.out.println("\nAfter swap");
                for(int k=0; k<data.length;k++)
    				System.out.print(" "+data[k]);
            } 
	    }
	    return data;
	}

}
