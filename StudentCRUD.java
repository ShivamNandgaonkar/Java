package Lab;
/*
 Create CRUD operation for students details accepting the input from user for confirming the operations.
 1.Enter the student details
 2.Retrieve the students details 
 3.Delete the students details
 4.Edit the students details
 */
import java.sql.*;
import java.util.Scanner;

//Main Class
public class StudentCRUD 
{
	//Main Method
    public static void main(String[] args) throws ClassNotFoundException 
    {
    	//Scanner Class Object
        Scanner scanner = new Scanner(System.in);
        
        try 
        {
        	//Step 1:-
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	//Step 2:-
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "root");
            
            while (true) 
            {
                System.out.println("Choose an operation: ");
                System.out.println("1. Enter student details");
                System.out.println("2. Retrieve student details");
                System.out.println("3. Delete student details");
                System.out.println("4. Edit student details");
                System.out.println("5. Exit");
                int choice = scanner.nextInt();
                //Switch case
                switch (choice) 
                {
                    case 1:
                        // Create operation - Enter student details
                        System.out.println("Enter student name:");
                        String name = scanner.next();
                        System.out.println("Enter student age:");
                        int age = scanner.nextInt();
                        String insertQuery = "INSERT INTO students (name, age) VALUES (?, ?)";
                        //prepared statements 
                        PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
                        insertStatement.setString(1, name);
                        insertStatement.setInt(2, age);
                        insertStatement.executeUpdate();
                        System.out.println("Student details added successfully.");
                        break;
                        
                    case 2:
                        // Retrieve operation - Retrieve student details
                        String selectQuery = "SELECT * FROM students";
                        //Create statements 
                        Statement selectStatement = connection.createStatement();
                        ResultSet resultSet = selectStatement.executeQuery(selectQuery);
                        while (resultSet.next()) 
                        {
                            int id = resultSet.getInt("id");
                            String studentName = resultSet.getString("name");
                            int studentAge = resultSet.getInt("age");
                            System.out.println("ID: " + id + ", Name: " + studentName + ", Age: " + studentAge);
                        }
                        break;
                        
                    case 3:
                        // Delete operation - Delete student details
                        System.out.println("Enter student ID to delete:");
                        int idToDelete = scanner.nextInt();
                        String deleteQuery = "DELETE FROM students WHERE id = ?";
                        //prepared statements 
                        PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);
                        deleteStatement.setInt(1, idToDelete);
                        deleteStatement.executeUpdate();
                        System.out.println("Student details deleted successfully.");
                        break;
                        
                    case 4:
                        // Update operation - Edit student details
                        System.out.println("Enter student ID to update:");
                        int idToUpdate = scanner.nextInt();
                        System.out.println("Enter student name to update:");
                        String newName = scanner.next();
                        System.out.println("Enter student age to update:");
                        int newAge = scanner.nextInt();
                        String updateQuery = "UPDATE students SET name = ?, age = ? WHERE id = ?";
                        //prepared statements 
                        PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                        updateStatement.setString(1, newName);
                        updateStatement.setInt(2, newAge);
                        updateStatement.setInt(3, idToUpdate);
                        updateStatement.executeUpdate();
                        System.out.println("Student details updated successfully.");
                        break;
                        
                    case 5:
                        // Exit the program
                        connection.close();
                        System.out.println("Exiting...");
                        return;
                        
                    default:
                        System.out.println("Invalid choice!");
                }
            }
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
}
