package practice;
import java.util.Scanner;
public class demo2 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		int sum=0;
		
		for (int i = 1; i < num; i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if (sum==num)
		{
			System.out.println("its a perfect no"+sum);
		}
		else
		{
			System.out.println("its not a perfect no"+sum);
		}
	}

}
