package Inter;
import java.util.*;
public class W4A1Laput {
	static void laputmenu() {
		System.out.println("1)Add ");
		System.out.println("2)Subtract ");
		System.out.println("3)Multiply ");
		System.out.println("4)Divide ");
		System.out.println("5)Exit ");
		System.out.print("> ");
	}
	static void laputadd(double num1, double num2) {
		double sum = num1 + num2;
		System.out.println("The Answer is: " + sum);
		}
	static void laputsub( double num1,  double num2) {
	double subtract = num1 - num2;
	System.out.print("The Answer is: " + subtract);	
	}
	static void laputmultiply( double num1, double num2) {
		double multi = num1 * num2;
		System.out.print("The Answer is: " + multi);	
	}
	static void laputdivide( double num1, double num2) {
		double divide = num1 / num2;
		System.out.print("The Answer is: " + divide);	
	}
	public static void main(String [] args) {
		Scanner sclaput = new Scanner(System.in);
		laputmenu();
		int laputchoice = sclaput.nextInt();
		System.out.print("Input First Number: ");
		double num1 = sclaput.nextDouble();
		System.out.print("Input Second Number: ");
		double num2 = sclaput.nextDouble();
		
		switch (laputchoice) {
		case 1:
			laputadd(num1, num2);
		break;
		
		case 2:
			laputsub(num1, num2);
			break;
			
		case 3:
			laputmultiply(num1, num2);
			break;
		case 4:
			laputdivide(num1, num2);
			break;
		case 5:
			System.out.print("Thank you for using");
			
		}
	}	
}

