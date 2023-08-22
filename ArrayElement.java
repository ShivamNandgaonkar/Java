package Lab;
/*
 *Write a program that takes the size of the number as input from the user
 *Then, prompt the user to enter elements of the number. 
 *Calculate and display the sum of all elements in the number.
 */

import java.util.Scanner;
public class ArrayElement 
{

	public static void main(String[] args)
	{
		
		//Scanner class object
		Scanner sc =new Scanner(System.in);
		
		// Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Create an array of the given size
        int[] numbers = new int[size];

        // Get elements from the user and store them in the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++)
        {
            System.out.print("Element " + i + ": ");
            numbers[i] = sc.nextInt();
        }

        // Calculate the sum of all elements in the array
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        // Display the result
        System.out.println("The sum of all elements in the array is: " + sum);

        // Close the Scanner
        sc.close();
    }
}


