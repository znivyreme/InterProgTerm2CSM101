package laput;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class W3E1Laput {
	public static void main (String [] args) {
		// For user input
		Scanner sclaput = new Scanner(System.in);
		int laputch;
		 // keeps looping until the user input 3
		do {
			// displaying the choices
	      System.out.println("(1) Input New Student Record");
	      System.out.println("(2) View Student Record");
	      System.out.println("(3) Exit");
	      System.out.print("> ");
	      laputch = sclaput.nextInt();
	      sclaput.nextLine();
	      switch (laputch) {
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
	            
	          case 3:
	        	  //choice 3 exit the program
	        	  System.out.println("Exiting Program");
	            break;
	                
	          default:
	        	  System.out.println("Incorrect Choice!");
	            }
	      // repeats until the user input choice number 3
	        } while (laputch != 3);
	    }
	}
