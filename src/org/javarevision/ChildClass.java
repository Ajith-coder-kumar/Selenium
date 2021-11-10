package org.javarevision;

public class ChildClass extends ParentClass
{
	public void tc0() 
	{
		System.out.println("Child Class 1");
	}
	public void tc1() 
	{
		System.out.println("Child test case 2");
	}
	public void tc2() 
	{
		System.out.println("Overrided Class");
		
	}

	public static void main(String[] args)
	{
		ParentClass c = new ChildClass ();
		c.tc0();
		c.tc1();
		c.tc2();
	}
}
