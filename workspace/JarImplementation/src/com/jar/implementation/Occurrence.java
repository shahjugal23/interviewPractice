package com.jar.implementation;

class Occurrence { 
			static final int MAX_CHAR = 256; 

			static void getOccuringChar(String str) 
			{ 
				// Create an array of size 256 i.e. ASCII_SIZE 
				int count[] = new int[MAX_CHAR]; 

				int len = str.length(); 

				// Initialize count array index 
				for (int i = 0; i < len; i++) 
					count[str.charAt(i)]++; 

				System.out.println("Count array is : "+ count);
				// Create an array of given String size 
				char ch[] = new char[str.length()]; 
				for (int i = 0; i < len; i++) { 
					ch[i] = str.charAt(i); 
					int find = 0; 
					for (int j = 0; j <= i; j++) { 

						// If any matches found 
						if (str.charAt(i) == ch[j]) 
							find++;				 
					} 

					if (find == 1) 
						System.out.println("Number of Occurrence of " + 
						str.charAt(i) + " is:" + count[str.charAt(i)]);			 
				} 
			} 
			public static void main(String[] args) 
			{ 
				String str = "abbaaa"; 
				getOccuringChar(str); 
				int arr[] = {1,2,3,4,-4,4,3,3,9,100,-1,2,2,2,2,2,2,2,2,-1};
				getOccurenceOfPositive(arr);
			} 
			
			// Positive occurence 
			
			// CHECK SortBinaryArray, FindANDRemoveDuplicate
			
			public static void getOccurenceOfPositive(int arr[]){
				int len = arr.length;
				System.out.println("Length: "+ len);
				int currLen =0, maxLen=0; 
				for(int i = 0; i<len; i++)
				{
					if(arr[i]>0)
					{
						currLen++;
					}
					else{
						if(currLen>maxLen){
							maxLen=currLen;
							System.out.println("MaxLength="+maxLen);
						}
						currLen =0;
					}
				}
				
				if(maxLen>0){
					System.out.println("The maximum occurence of positive integers in the array is : "+ maxLen);
				}
				else{
					System.out.println("No sequence of positive integers.");
				}
			}
		} 

