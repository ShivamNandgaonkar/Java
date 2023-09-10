package Lab;
//How to remove a particular character from a String.
public class RemoveParticularCharacterFromString 
{
	public static void main(String[] args) 
	{
		
		StringBuffer s = new StringBuffer();

        s.append("Hello"); // Appending a string
        
        // Converting to a string and printing
        System.out.println("String Before Deleting Dharacter:"+s.toString());

        //Deleting Particular Character From String
        s.deleteCharAt(1);
        
        //Print
        System.out.println("String After Deleting Character At Index 1:"+s.toString());
	}

}