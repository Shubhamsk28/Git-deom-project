package exception;

public class prgm3 
{
	public static void main(String[] args) 
	{
	
		System.out.println("main starts ");
		try
		{
			throw new ArithmeticException();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("main ends");
	}

}
