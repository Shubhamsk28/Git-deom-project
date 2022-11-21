package practice;

import java.util.Scanner;

public class bill 
{

	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.println("enter the unit");
	   int unit=sc.nextInt();
	   
	   double amt=0;
	   
	   if(unit<=100)
	   {
		   amt=unit*1;
		   System.out.println("total electric bill amt"+amt);
	   }
	   else if((unit>=101)&&(unit<=200))
	   {
		   amt=100*1+((unit-100)*2.5);
		   System.out.println("total electric bill amt"+amt);
	   }
	   else if((unit>=201)&&(unit<=400))
	   {
		   amt=100*1+100*2.5+200+((unit-200)*4.5);
		   System.out.println("total electric bill amt"+amt);
	   }
	   else if(unit>=401)
	   {
		   amt=100*1+100*2.5+200*4.5+((unit-400)*9);
		   System.out.println("total electric bill amt"+amt);
	   }
	   

	}

}
