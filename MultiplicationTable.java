package Lab;
import java.util.Scanner;
/*
Write a Java program that prompts the user to enter a number 
and then prints the multiplication table of that number using a for loop.
The table should display multiplication from 1 to 10.
*/

public class MultiplicationTable 
{
	
    public static void main(String[] args) 
    {
    	//Scanner class object
        Scanner s = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.println("Enter a number: ");
        
        int number = s.nextInt();
        
        // Print the multiplication table
        System.out.println("Multiplication table of " + number + ":");
        
        //incremented i by 1
        for (int i = 1; i <= 10; i++)
        	
        {
        	//Display The output of Multiplication table
            System.out.println(number + " * " + i + " = " + number * i);
            s.close();
        }
    }
}