package com.masai;

public class Demo implements check {

	@Override
	public void fun1() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		Demo myDemo = new Demo();
		myDemo.fun1();
	}
}
