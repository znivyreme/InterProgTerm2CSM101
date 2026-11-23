package laput;
import java.io.FileWriter;
import java.io.IOException;
public class W3A1Laput {
public static void main (String [] args) {
	try (FileWriter writer = new FileWriter ("Vinz Rashcid.text")){
		writer.write ("Welcome to Java File Handling!");
		System.out.println("Text Successfully Written.");
		} catch (IOException e) {
			System.out.println("Error Writing to film");
		}
	}
}
