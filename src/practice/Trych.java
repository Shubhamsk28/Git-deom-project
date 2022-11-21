package practice;

public class Trych 
{
	int a=10;
	public static void main(String[] args) 
	{
		try
		{
			Trych a1=null;
			System.out.println(a1.a);
		}
		catch(ArithmeticException a)
		{
			System.out.println(a.getMessage());
		}
		catch(StringIndexOutOfBoundsException b)
		{
			System.out.println(b.getMessage());
		}
		catch(NullPointerException c)
		{
			System.out.println(c.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException d)
		{
			System.out.println(d.getMessage());
		}
		
	}
}
