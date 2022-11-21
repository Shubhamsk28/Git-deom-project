package practice;

public class TCAex
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		
		System.out.println("hello");
		
		try 
		{
			System.out.println("enter the main try block");
			System.out.println(a/b);
			System.out.println("exit the try block");
		}
		catch (ArithmeticException e)
		{
			System.out.println("enter the catch block");
			System.out.println(e.getMessage());
			System.out.println("exiting the catch block");
		}

	}
	
}
