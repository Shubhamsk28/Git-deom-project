package practice;

import java.util.Scanner;

public class demo {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the  name");
		String ch=sc.next();
		
		if((ch=="pranali")&&(ch=="sanjana")&&(ch=="nivedita"))
		{
			if(ch=="pranali")
			{
				System.out.println("women");
			}
			else
			{
				System.out.println("men");
			}
		}
		else
		{
			System.out.println("invalid element");
		}

	}

}
