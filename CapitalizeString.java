package Lab;
/*
 Write a Java Program to capitalize each word in String.
 */
import java.util.Scanner;

//Main Class 
public class CapitalizeString
{
	//Main Method
	public static void main(String[] args) 
	{
		//Scanner Class Object
		Scanner sc = new Scanner(System.in);
		
		//Taking input from user
		System.out.println("Enter the string for the operations: ");		
		String str1 = sc.nextLine();
		
		//Converting string to UpperCase 
		String upper = str1.toUpperCase();			
		
		//Displaying the UpperCase
		System.out.println("The Uppercase of the string is: "+ upper);	
		sc.close();
	}
}