package practice;

public class Trych4 
{
	public static void main(String[] args) 
	{
		try
		{
			String a="shubh";
			System.out.println(a.charAt(5));
		}
		catch(StringIndexOutOfBoundsException a)
		{
			System.out.println(a.getMessage());
		}
		catch(Exception a)
		{
			System.out.println(a.getMessage());
		}
		
	}

}
