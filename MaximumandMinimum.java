package Lab;
import java.util.Scanner;
/*
 Given an array of integers, write a Java program to find the maximum and minimum elements in the array.
 */
public class MaximumandMinimum
{
	public static void main(String[] args) 
	{
		//Scanner Class Object
        Scanner sc= new Scanner(System.in);

        //Display the Number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        //Display to enter the elements from the user.
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) 
        {
            array[i] = sc.nextInt();
        }

        //Closing Scanner Class
        sc.close();

        //First Elements of minimum array
        int min = array[0];
        //First Elements of maximum array
        int max = array[0];

        //Using For loop
        for (int num : array) 
        {
            if (num < min)
            {
                min = num;
            }
            if (num > max) 
            {
                max = num;
            }
        }

        //Display the output of Array elements 
        System.out.println("Array elements: " + java.util.Arrays.toString(array));
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}

