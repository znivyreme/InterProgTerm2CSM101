package laput;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class W3E1Laput {
	public static void main (String [] args) {
		// For user input
		Scanner sclaput = new Scanner(System.in);
		int laputchoice;
		 // keeps looping until the user input 3
		do {
			// displaying the choices
	      System.out.println("(1) Input New Student Record");
	      System.out.println("(2) View Student Record");
	      System.out.println("(3) Search a Student");
	      System.out.println("(4) Exit");
	      System.out.print("> ");
	      laputchoice = sclaput.nextInt();
	      sclaput.nextLine();
	      switch (laputchoice) {
	          case 1:
	        	// choice 1 input new student record
	   System.out.print("StudNumber: ");
	    String laputstudnum = sclaput.nextLine();
	            
	   System.out.print("Student Lastname: ");
	    String laputlstname = sclaput.nextLine();

	   System.out.print("First Name: ");
	    String laputfirstname = sclaput.nextLine();

	   System.out.print("Student Course: ");
	    String laputcourse = sclaput.nextLine();
	    
	 // writing student information into the text file
	     try (FileWriter writer = new FileWriter("VinzRashcid.txt", true)) {
	         writer.write("Student Number: "+laputstudnum + "\n");
	         writer.write("Last Name: " + laputlstname + "\n");
	         writer.write("First Name: " + laputfirstname + "\n");
	         writer.write("Course: " + laputcourse + "\n");
	         writer.write("\n");
	         System.out.println("Student Record Added!");
	   } catch (IOException e) {
	   System.out.println("Error Writing File");
	           }
	           break;

	          case 2:
	        	  // choice 2  view the saved student records
	   try (FileReader reader =
	       new FileReader("VinzRashcid.txt")){
	         int ch;
             // reads and displays each character in the file
	         while ((ch = reader.read()) != -1) {
	         System.out.print((char) ch);
	         }

	         } catch (IOException e) {
	        	 System.out.println("Error Reading File.");
	            }
	            break;
	           
	           //Choice 3: Search a student
              case 3:
                  System.out.print("Enter Student Number to Search: ");
                  String searchName = sclaput.nextLine();
                  boolean found = false;
                  try (BufferedReader reader =
                      new BufferedReader(new FileReader("VinzRashcid.txt"))) {
                	  String line;
          
          // reads the file line by line
          while ((line = reader.readLine()) != null) {
                  
        	  // checks if the student number matches
            if (line.equalsIgnoreCase("Student Number: " + searchName)) {
                 found = true;
                   System.out.println("\nSTUDENT RECORD");

                    // displays the matching student details
                    System.out.println(line);

                    String lastName = reader.readLine();
                    String firstName = reader.readLine();
                    String course = reader.readLine();
                    System.out.println(lastName);
                    System.out.println(firstName);
                    System.out.println(course);
                              break;
                          }
                      }
             if (!found) {
                   System.out.println("\nStudent record not found.");
                      }
                  } catch (IOException e) {
                   System.out.println("File Error: " + e.getMessage());
                  }
                  break;
                  // choice 4 to exit the program
              case 4:
                  System.out.println("Exiting Program");
                  break;
              default:
                  System.out.println("Incorrect Choice!");
          }
      } while (laputchoice != 4);
   }
}
	        	
