package Lab;
/*
 Write a Java program that takes an integer input from the user
 and checks if it is even or odd using bitwise operators.
 Print "Even" if the number is even, and "Odd" if the number is odd.
 */
import java.util.Scanner;
public class Bitwiseoperator 
{
	 public static void main(String[] args)
	 {
		 	//Scanner class object.To get the input from the user.
	        Scanner sc = new Scanner(System.in);
	        
	        // Get the number from the user
	        System.out.println("Enter an integer: ");
	        int number = sc.nextInt();
	        
	        // Check if the number is even or odd
	        if (number % 2 == 0) 
	        {
	            System.out.println("Even");
	        }
	        else 
	        {
	            System.out.println("Odd");
	        }
	        sc.close();
	  }
}