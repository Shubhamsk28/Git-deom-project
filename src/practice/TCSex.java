package practice;

public class TCSex 
{
	public static void main(String[] args) 
	{
		System.out.println("main method");
		String S="shubhsm";
		try 
		{
			System.out.println("enter the try block");
			System.out.println(S.charAt(7));
			System.out.println("exit the try block");	
		}
		
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("enter the catch block");
			System.out.println(e.getMessage());
			System.out.println("exit the catch block");
		}
		
		
	}
}