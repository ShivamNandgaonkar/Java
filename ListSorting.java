package Lab;
/*
 Write a Java program that sorts a list of strings in alphabetical order using the Collections framework.
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// Main Class
public class ListSorting 
{
	//Main Method
	public static void main(String[] args) 
	{
		// Create a list of strings
		List<String> list = new ArrayList<>();
		
		//adding the elements
		list.add("Mango");
		list.add("Apple");
		list.add("Orange");
		list.add("Grapes");
		list.add("Cherry");
		list.add("Date");
		
		// Print The Main List of String 
		System.out.println("Main List: " + list);
		
		//Sort the List in alphabetical order
		Collections.sort(list);
		
		//Print the alphabetical list in this statements
		System.out.println("Alphabetical List: " + list);

	}

}
