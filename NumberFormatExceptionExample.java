package Lab;
/*
 Write  a Java program that reads a string input from the user. 
 Convert the string to an integer using the Integer.parseInt() method. 
 Handle the NumberFormatException that can occur if the input cannot be parsed as an integer. 
 Display a message indicating that the input is not a valid integer.
 */
import java.util.Scanner;

// Main Class.
public class NumberFormatExceptionExample 
{
	// Main Method.
	public static void main(String[] args) 
	{
		// Scanner Class Object.
		Scanner sc = new Scanner(System.in);
		
		//Prompt the user to enter a integer.
		System.out.println("Enter a Integer: ");
		
		//Read the input from the user.
		String input =sc.nextLine();
		
		//try to convert the input to an integer.
		try 
		{
			int num = Integer.parseInt(input);
			//Print the integer to the user.
			System.out.println("Converted Integer: " + num);
			
		}
		catch(NumberFormatException e)
		{
			//Print a message which show the input is not a valid integer.
			System.out.println("The input is not a valid integer. ");
		}
		sc.close();
	}

}
