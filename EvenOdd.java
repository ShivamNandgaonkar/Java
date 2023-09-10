package Lab;
/*
 Write a Java program that creates two threads to find 
 and print even and odd numbers from 1 to 20.
 */

class EvenNumber implements Runnable
{

    @Override
    public void run() 
    {
    	//using for loop
        for (int i = 2; i <= 20; i += 2) 
        {
        	
            System.out.println("Even: " + i);
            //using try catch
            try 
            {
                Thread.sleep(100); // Sleep for a short time for better visualization
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }
}

class OddNumber implements Runnable 
{

    @Override
    public void run() 
    {
    	//using for loop
        for (int i = 1; i <= 19; i += 2) 
        {
            System.out.println("Odd: " + i);
            //Using Try Catch block
            try 
            {
                Thread.sleep(100); // Sleep for a short time for better visualization
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }
}

//Main Class
public class EvenOdd
{
	//Main Method
    public static void main(String[] args) 
    {
        // Create two threads for even and odd numbers
        Thread even = new Thread(new EvenNumber());
        Thread odd = new Thread(new OddNumber());

        // Start the threads
        even.start();
        odd.start();
    }
}
