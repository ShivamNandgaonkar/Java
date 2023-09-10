package Lab;
/*
 *Write a Java program to count the total number of occurrences of a given character in a string without using any loop?
 */

//import the packages
import java.util.Scanner;
import java.lang.StringBuffer;

public class WordCountString 
{

	public static void main(String[] args) 
	{
		
		//Creating object of the Scanner class
		Scanner sc = new Scanner(System.in);
		
		//Creating object of the StringBuffer
		StringBuffer s = new StringBuffer();
		
		//Print statement to Enter the String 
		System.out.println("Enter the string : ");
		
		//Using append method to add the string value in string buffer
		s.append(sc.nextLine());
		
		//To store the count of string is this variable 
		int count = s.length();
		
		//Print the result
		System.out.println("Total character in string is : "+count);
		
		//Close the scanner class
		sc.close();
	}

}