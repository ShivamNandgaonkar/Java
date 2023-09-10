package Lab;
/*
 Write a Java program that creates a bank account with concurrent deposits and withdrawals using threads.
 */

//Main Class
public class BankAccount 
{
    private double balance;

    public BankAccount(double initialBalance) 
    {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) 
    {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public synchronized void withdraw(double amount) 
    {
        if (balance >= amount) 
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        }
        else 
        {
            System.out.println("Insufficient balance for withdrawal: " + amount);
        }
    }

    public double getBalance() 
    {
        return balance;
    }

    //Main Method
    public static void main(String[] args) 
    {
    	
        BankAccount acc = new BankAccount(1000.0);

        Thread depositThread = new Thread();
        {
            for (int i = 0; i < 5; i++)
            {
            	//Adding the 100rs amount in bank
                acc.deposit(100.0);
                try 
                {
                	//TO Delay
                    Thread.sleep(100); 
                } 
                catch (InterruptedException e) 
                {
                    e.printStackTrace();
                }
            }
        }

        Thread withdrawThread = new Thread(); 
        {
            for (int i = 0; i < 5; i++) 
            {
            	//Withdrawing the 100rs amount from bank
                acc.withdraw(100.0);
                try 
                {
                	//To Delay s
                    Thread.sleep(100); 
                } 
                catch (InterruptedException e) 
                {
                    e.printStackTrace();
                }
            }
        }

        //Starting the thread
        depositThread.start();
        withdrawThread.start();

        try 
        {
        	//Join the thread
            depositThread.join();
            withdrawThread.join();
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }

        // Display the Main Output
        System.out.println("Final Balance: " + acc.getBalance());
    }
}
