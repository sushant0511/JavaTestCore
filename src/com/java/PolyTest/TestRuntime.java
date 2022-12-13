package com.java.PolyTest;

class User
{
	public void test()
	{
	System.out.println("Hi from Test");	
	}
	
}

class NewUser extends User
{
	public void test()
	{
		System.out.println("Hi from new Test");
	}
}
public class TestRuntime {

	
	public static void main(String[] args) {
		
		
		
		User user=new NewUser();
		user.test();
	}
}
