package Lab;
//program for reverseString using StringBuffer class.
import java.util.Scanner;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		//creating object of scanner class
		Scanner scanner = new Scanner(System.in);
    
		System.out.print("Enter a string: ");
		
		// Taking input from the user
		String input = scanner.nextLine();
    
		//passing arguments to function
		String reversed = reverseString(input);
    
		System.out.println("Reversed string: " + reversed);
		
		//Closing Scanner Class object
		scanner.close();
	}

	public static String reverseString(String str) 
	{
		//logic to reverse string
		StringBuffer reversed = new StringBuffer(str).reverse();
		
		return reversed.toString();
	}
}