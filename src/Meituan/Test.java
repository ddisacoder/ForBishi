package Meituan;

import java.util.MissingFormatArgumentException;

public class Test {

	static{
		System.out.println("jing");
	}
	
	{
		System.out.println("dai");
	}
	public Test(){
		System.out.println("gou");
	}
	
	public static void main(String[] args) {
		Test t = new Test();
	}
}
