package Lab;
/*
 Write a Java Program to prove that strings are immutable in java.
 */
public class StringImmutable
{
    public static void main(String[] args) 
    {
        String str = "Hello";
        // Trying to change the string
        str.concat(" World");
        // Prints the original string
        System.out.println(str); // Output: Hello
    }
}
