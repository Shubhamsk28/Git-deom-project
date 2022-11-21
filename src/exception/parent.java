package exception;

public class parent
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		String s="shubham";
		try
		{
			System.out.println("enter the try block");
			System.out.println(s.charAt(5));
			System.out.println("exits the try block");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("main ends");		
	}
}
