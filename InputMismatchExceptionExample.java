package Lab;
/*
 Write a Java program that reads an integer from the user using the Scanner class.
 Handle the InputMismatchException that can occur if the user enters a non-integer value. 
 Display an appropriate error message.
 */
import java.util.Scanner;
import java.util.InputMismatchException;
//Main Class
public class InputMismatchExceptionExample 
{
	// Main Method
	public static void main(String[] args) 
	{
		// Creating Scanner class object
		Scanner sc = new Scanner(System.in);
		
		//Display the User to enter an Integer
		System.out.println("Enter an Integer: ");
		
		//Try to read an integer from the user 
		try 
		{
			int num =sc.nextInt();
			//Print the integer to the console
			System.out.println("You entered the integer " + num);
		}
		// Catch the InputMismatchException
		catch(InputMismatchException e)
		{
			//Print an error message if user enter a non-integer value
			System.out.println("Error: Please enter a valid integer.");
			sc.nextLine();
		}
		//Closing Scanner Class
		sc.close();
	}

}
