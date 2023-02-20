package com.project;

public class OverloadDemo {
	public void calculation(String name) {
		System.out.println("String name :RAM");
	}
	public void calculation(int a,float b) {
		float c=a+b;
		System.out.println("Addition");
		System.out.println(a+b);
	}
	public void calculation(int a,int b) {
		System.out.println("Multification");
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		OverloadDemo obj=new OverloadDemo();
		obj.calculation("Ram");
		obj.calculation(25, 45.5f);
		obj.calculation(10, 20);

	}

}
