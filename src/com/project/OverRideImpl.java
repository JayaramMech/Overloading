package com.project;

public class OverRideImpl extends OverRideDemo {
	public void run() {
		System.out.println("run fast");
	}

	public static void main(String[] args) {
		OverRideImpl obj=new OverRideImpl();
		obj.run();
		obj.print();
		

	}

}
