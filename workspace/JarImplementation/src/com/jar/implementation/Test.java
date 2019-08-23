package com.jar.implementation;


class A{
	int a;
	public int b;
	private int c;
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		obj.a=10;
		obj.b=20;
		//obj.c = 30;
		System.out.println(obj.a+""+obj.b);
		
		int j = 5&4&6;
		System.out.println(j);
		
		product(6,7);
		
		String line = " User1, User2,User1,User22,user1 ";
		String str[] = line.split(",");
		for (int i = 0; i < str.length; i++) {
			System.out.print("\t"+str[i]);
		}
	}

	private static void product(int i, int j) {
		int prd =0;
		while(j>0){
			prd = prd + i;
			j--;
		}
		System.out.println("The product is  :"+ prd);
	}
	

}
