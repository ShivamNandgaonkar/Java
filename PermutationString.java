package Lab;
/*
 Write a Java program to find all permutations of a string?
 */
public class PermutationString
{
    public static void main(String[] args)
    {
        String input = "abc";
        System.out.println("Permutations of " + input + ":");
        generatePermutations(input);
    }

    public static void generatePermutations(String input) 
    {
        generatePermutations("", input);
    }

    private static void generatePermutations(String prefix, String remaining)
    {
        int n = remaining.length();
        if (n == 0) 
        {
            System.out.println(prefix);
        } 
        else 
        {
            for (int i = 0; i < n; i++) 
            {
                generatePermutations(prefix + remaining.charAt(i), 
                                    remaining.substring(0, i) + remaining.substring(i + 1, n));
            }
        }
    }
}
