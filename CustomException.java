package Lab;
import java.util.Scanner;
/*
Write a program that takes an integer input from the user and throws 
this custom exception if the input is negative.
Catch the exception and display an error message accordingly.*/
import java.util.Scanner;

//Custom Exception Class
 public class CustomException
{
	public static void main(String[]args)
	{
		//Scanner class to take input from user
		Scanner sc = new Scanner(System.in);
		
		//get a number from user
		System.out.println("Enter a number:");
		
		//Integer input for variable num.
		int num = sc.nextInt();
		
		try 
		{
			//if loop condition to check number is less than equal to zero.
			if(num<=0)
			{
				//checks the number is negative and handle the exception
				throw new Exception("Negitive number is not allow:");	
		    }
			System.out.println("Number is Positive");
		}
		
		catch(Exception e)
		{
			System.out.println("Error"+ e.getMessage());
		}
		
		finally
		{
		//closing the scanner class object
		sc.close();
		}
 
	}
}