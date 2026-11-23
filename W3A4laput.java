package laput;
import java.io.FileWriter;
import java.io.IOException;
public class W3A4laput {
 public static void main (String[] args) {
	 try (FileWriter writer =
			 		new FileWriter("Laputp4.text", true)) {
		 
		 writer.write("\nToday I learned filewriter.");
		 System.out.println("New Text Added.");
		 
	 	}catch (IOException e) {
	 		System.out.println("Unable to update file");
	 	}
 	}
}
