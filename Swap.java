package Lab;
/*
 Write a Java program that takes two integer inputs from the user
 and swaps their values using bitwise operators. 
 After swapping, print the updated values of the two integers.
 */
import java.util.Scanner;
public class Swap 
{
    public static void main(String[] args) 
    {
    	//Scanner class object.To get the input from the user.
        Scanner sc = new Scanner(System.in);
        
        // Get the two integers from the user
        System.out.println("Enter the first integer: ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter the second integer: ");
        int num2 = sc.nextInt();
        
        //Before Swapping the integer value.
        System.out.println("Before swapping:");
        System.out.println("First integer: " + num1);
        System.out.println("Second integer: " + num2);
        
        // Swap the integers using XOR
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        
        // Print the updated values of the two integers
        System.out.println("After swapping:");
        System.out.println("The first integer is now: " + num1);
        System.out.println("The second integer is now: " + num2);
        
        sc.close();
    }
}
