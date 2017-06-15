package com.test;

public class TestClass {

	public static void main(String[] args) {
		System.out.println("hi");
		 short a=10;
		 short b=10;
		// a=  (a+b);
		// a= (short) (a+b);
		 a+=b;
		 System.out.println(a);
		 
		 
		 int c=10;
		 int d=20;
		 c=c+d;
		 System.out.println(c);
		 c+=d;
		 System.out.println(c);
		 
		 System.out.println("*********** bYte range -128 to 127 ******************");
		 
		 byte k=2;
		 byte j= (byte) 130;
		 System.out.println(j);
		k=(byte) (k+j);
		 //k+=j;
		 System.out.println(k);
		 
		 
	}
	

}
