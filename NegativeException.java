package Lab;
import java.util.Scanner;
class NegativeInputException extends Exception 
{
    private int value;

    public NegativeInputException(int value)
    {
        this.value = value;
    }

    public int getValue() 
    {
        return value;
    }
}

class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        try 
        {
            System.out.print("Enter an integer: ");
            int userInput = sc.nextInt();

            if (userInput < 0) {
                throw new NegativeInputException(userInput);
            } else {
                System.out.println("Input is: " + userInput);
            }
        } 
        catch (NegativeInputException e)
        {
            System.out.println("Error: Negative input not allowed! You entered: " + e.getValue());
        } 
        catch (java.util.InputMismatchException e) 
        {
            System.out.println("Error: Please enter a valid integer.");
        }
        sc.close();
    }
}
