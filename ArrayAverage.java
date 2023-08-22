package Lab;
/*
 Write a program that takes the size of the array as input from the user. 
 Then, prompt the user to enter elements of the array. 
 Calculate and display the average of all elements in the array.
 */
import java.util.Scanner;

public class ArrayAverage 
{
    public static void main(String[] args) 
    {
    	//Scanner class object
        Scanner sc = new Scanner(System.in);

        // Get the size of the number from the user
        System.out.print("Enter the size of the number: ");
        int size = sc.nextInt();

        // Create an number of the given size
        int[] number = new int[size];

        // Get elements from the user and store them in the number
        System.out.println("Enter the elements of the number:");
        for (int i = 0; i < size; i++) 
        {
            System.out.print("Element " + i + ": ");
            number[i] = sc.nextInt();
        }

        // Calculate the sum of all elements in the number
        int sum = 0;
        for (int num : number) 
        {
            sum += num;
        }

        // Calculate the average
        double average = (double) sum / size;

        // Display the result
        System.out.println("The average of all elements in the number is: " + average);

        // Close the Scanner
        sc.close();
    }
}