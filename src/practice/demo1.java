package practice;
import java.util.Scanner;
public class demo1
{

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		int count=0;
		
		for (int i = 1; i<=num; i++)
		{
			if(num%i==0)
			{
				count++;
			}
			
		}
		if(count==2)
		{
			System.out.println("prime num"+num);
		}
		else
		{
			System.out.println("composite num"+num);
		}
	}
}
