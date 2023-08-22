package Lab;
/*
 Write a Java program that takes an integer input from the user
 and checks if it is a power of 2 using bitwise operators. 
 Print "Yes" if it is a power of 2, and "No" otherwise.
 */
import java.util.Scanner;
public class PowerOf2 
{
    public static void main(String[] args) 
    {
    	//Scanner class Object
        Scanner sc = new Scanner(System.in);
        
        // Get the number from the user
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        
        // Check if the number is a power of 2
        if ((num & (num - 1)) == 0) 
        {
            System.out.println("Yes");
        } 
        else 
        {
            System.out.println("No");
        }
        sc.close();
    }
}


