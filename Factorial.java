package Lab;
/*
Write a Java program that prompts the user to enter a positive integer 
and calculates its factorial using a while loop.
The program should display the factorial as the output.
*/

import java.util.Scanner;

public class Factorial 
{
public static void main(String[] args)
{  
	//Scanner class Object 
    Scanner s = new Scanner(System.in);
    
    // Prompt the user to enter a positive integer
    System.out.println("Enter a Positive Integer: "); 
    
    int num = s.nextInt(); 
    
    if (num < 0) 
    {
    	//Display the Invalid Input  
        System.out.println("Invalid input. Please enter a positive integer.");
    }
    //condition number is less than 0
    while (num < 0)
    {
    	
    }
    // Calculate the factorial of the number   
    int factorial = 1; 
    
    //initialized i to 1
    int i = 1;  

    //condition i is less than or equal to numbers
    while( i <= num)
    {  
        factorial *= i; 
   
        //increment i by 1  
        i++;               
    }     

    // Print the factorial of a number
    System.out.println(" The Factorial of " + num + " is: " + factorial); 
    s.close();
}  

}