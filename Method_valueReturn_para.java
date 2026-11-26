package Inter;
public class Method_valueReturn_para {
 static int add (int first, int second) {
	 int sum = first + second;
	 return sum;
 	}
 public static void main(String [] args) {
	 int answer = add (12, 8);
	 System.out.print("Sum: " + answer);
 }
}
