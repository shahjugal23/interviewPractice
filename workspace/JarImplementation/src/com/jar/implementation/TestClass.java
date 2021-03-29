package com.jar.implementation;

public class TestClass {

	public static void main(String[] args) {
String s = "aaabbbbccd";
        
        char charArr[] = s.toCharArray();
        int count = 1, i= 0;
        String newString = "";
        for( i = 0; i < charArr.length -1 ; i++){
            if(charArr[i]==charArr[i+1])
            {
                count++;
            }
            else
            {
                newString = newString + charArr[i] + count;
                count = 1;
            }
        }
        newString = newString + charArr[i] + count;
        System.out.println("The string is : "+ newString);
	}

}
