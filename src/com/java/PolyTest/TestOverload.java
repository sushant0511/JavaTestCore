package com.java.PolyTest;

class Test
{
	public void show()
	{
		System.out.println("Hi from SHow");
	}

	public void show(int a)
	{
		System.out.println("Hi from Show with parameter");
	}

}


public class TestOverload {

	public static void main(String[] args) {
		
		Test test=new Test();
		test.show();
		test.show(12);
	}
}
