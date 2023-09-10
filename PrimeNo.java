package Lab;
import java.util.ArrayList;
import java.util.List;

/*
 Write a Java program that calculates the sum of all prime numbers up to a given limit using multiple threads
 */
class Prime implements Runnable 
{
    private final int start;
    private final int end;
    private final List<Integer> primes;

    public Prime(int start, int end, List<Integer> primes) 
    {
        this.start = start;
        this.end = end;
        this.primes = primes;
    }

    @Override
    public void run() 
    {
    	//Using for loop
        for (int num = start; num <= end; num++)
        {
            if (isPrime(num))
            {
                synchronized (primes) 
                {
                    primes.add(num);
                }
            }
        }
    }

    private boolean isPrime(int n) 
    {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i += 6) 
        {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
}

//Main Class
public class PrimeNo
{
	//Main Method
    public static void main(String[] args) 
    {
    	// Giving the limit 
        int limit = 500; 
        // number of threads as needed
        int numThreads = 3; 

        //creating the list of the integers
        List<Integer> primes = new ArrayList<>();
        List<Thread> threads = new ArrayList<>();

        int batchSize = limit / numThreads;

        for (int i = 0; i < numThreads; i++)
        {
            int start = i * batchSize + 1;
            int end = (i == numThreads - 1) ? limit : (i + 1) * batchSize;
            // 
            Thread thread = new Thread(new Prime(start, end, primes));
            //Adding and starting thread
            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads) 
        {
        	//Using try catch 
            try 
            {
                thread.join();
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }

        long sum = primes.stream().mapToLong(Integer::intValue).sum();

        //Print the Statement and the result 
        System.out.println("Sum of prime numbers up to " + limit + " is: " + sum);
    }
}
