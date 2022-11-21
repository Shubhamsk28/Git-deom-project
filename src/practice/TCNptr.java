package practice;

public class TCNptr 
{
	int a=10;
	
	public static void main(String[] args)
	{
		System.out.println("main starts");
		try
		{
			System.out.println("entering the try block");
			TCNptr a1=null;
			System.out.println(a1.a);
			System.out.println("exiting the try block");
		}
		catch(NullPointerException e)
		{
			System.out.println("entring the catch block");
			System.out.println(e.getMessage());
			System.out.println("exiting the catch block");
		}
	}

}
