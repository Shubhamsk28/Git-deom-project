package practice;

import javafx.scene.layout.BackgroundFill;

public class TCArrayex 
{
	public static void main(String[] args) 
	{
		System.out.println("main starting");
		try 
		{
			System.out.println("entering try block");
			int arr[]=new int[2];
			System.out.println(arr[3]);
			System.out.println("exiting try block");
		}
		catch (ArrayIndexOutOfBoundsException b)
		{
			System.out.println("entering the catch block");
			System.out.println(b.getMessage());
			System.out.println("exiting the catch block");
		}
	}
}
