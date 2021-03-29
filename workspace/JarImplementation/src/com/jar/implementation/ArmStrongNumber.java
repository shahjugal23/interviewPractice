package com.jar.implementation;

public class ArmStrongNumber {

	public static void main(String []args){
        System.out.println("Power Function test ");
        
        double result = getPower(2,-2);
        System.out.println("Result : "+ result);
        System.out.println("Armstrong Number Check");
        
        int n = 164 ;
        
        int order = getOrder(n);
        System.out.println("Order of number is : "+order);
        
        checkArmstrong(n,order);
     }
     public static double getPower(int x, int n){
         //x ^ n
         double result = 1.0;
         if(n==0)
            return 1.0;
        else if(n>0){
            while(n!=0){
                result = result * x;
                n--;
            }
        }
        else if(n<0){
            while(n!=0){
                result = result/x;
                n++;
            }
        }
        return result;
         
     }
     public static int getOrder(int n)
     {
         int order =0;
         
         while(n!=0){
             n = n/10;
             order++;
         }
         return order;
     }
     
     public static void checkArmstrong(int n, int order){
         double sum = 0;
         int originalnumber = n;
         int rem = 0; 
         while(originalnumber!=0){
             
             rem = originalnumber%10;
             originalnumber = originalnumber/10;
             sum += getPower(rem,order);
         }
         
        if(sum == n)
        {
             System.out.println("It is an armstrong number ");
        
        }
        else
         System.out.println("Not an armstrong number ");
        
     }
}
