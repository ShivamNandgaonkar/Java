package Lab;
/*
 Write a Java program to find the average of all elements in an array of doubles.
 */
public class Doubles
{
	public static void main(String[] args)
	{
		//Defined the array double named as arr.
        double[] arr = { 5.5, 10.0, 7.2, 3.8, 9.6 };

        double sum = 0.0;

        for (double num : arr) 
        {
            sum += num;
        }

        double average = sum / arr.length;
        
        //Display the Array elements and average output.
        System.out.println("Array elements: " + java.util.Arrays.toString(arr));
        System.out.println("Average: " + average);
    }
}
