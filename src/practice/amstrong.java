package practice;
import java.util.Scanner;
public class amstrong 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" enter the number");
		int num=sc.nextInt();
		
		int rem=0,sum=0,temp=num;
		
		while(num>0)
		{
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num*10;
		}
		if(temp==num)
		{
			System.out.println("its a amstrong num"+sum);
		}
		else
		{
			System.out.println("its not a amstrong num"+sum);
		}
	}
}
