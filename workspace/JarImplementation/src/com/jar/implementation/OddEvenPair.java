package com.jar.implementation;

public class OddEvenPair {

	public static void main(String[] args) {
		int a[]={1,2,3,4};
		int evenPairCount =0 , oddPairCount=0;
		for(int i=0; i<a.length;i++){
			for(int j=i+1;j<a.length;j++)
			{
				if((a[i]+a[j])%2 !=0)
				{
					System.out.println("Odd pair :"+ a[i]+" "+a[j]);
					oddPairCount++;	
				}
				else if( (a[i]+a[j])%2==0)
				{
					System.out.println("Even pair :"+ a[i]+" "+a[j]);
					evenPairCount++;
				}
			}
		}
		System.out.println("Even Pair Count: "+evenPairCount);
		System.out.println("Odd Pair Count: "+oddPairCount);
		
		int absdiff = evenPairCount-oddPairCount;
		if(absdiff<0)
			absdiff *= -1;
		
		System.out.println("The absolute difference is : "+absdiff);
	}
}
