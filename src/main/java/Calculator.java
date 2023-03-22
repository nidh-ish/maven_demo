// Java calculator application
//Comment 2

import java.util.Scanner;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

	private static Logger log = LogManager.getLogger(Calculator.class);

	public double squareRoot(int x) {
		double result = Math.sqrt(x);
		log.info("Output of square root of " + x + " is: " + result);
		return result;
	}

	public long factorial(int x) {
		long result = 1;
		for(int i = 1; i <= x; i++) {
			result = result * i;
		}
		log.info("Output of factorial of " + x + " is: " + result);
		return result;
	}

	public double naturalLog(double x) {
		double result = Math.log(x);
		log.info("Output of natural logarithm of " + x + " is: " + result);
		return result;
	}

	public double power(double x, double b) {
		double result = Math.pow(x, b);
		log.info("Output of " + x + " to the power of " + b + " is: " + result);
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator calc = new Calculator();

		while(true) {
			System.out.print("Enter 1 for Squareroot function, 2 for Factorial function, 3 for NaturalLogarithm function, 4 for Power function, or 0 to exit: ");
			int choice = scanner.nextInt();

			if (choice == 0) {
				return;
			} else if (choice == 1) {
				System.out.print("Enter an integer to calculate its square root: ");
				int n = scanner.nextInt();
				System.out.println(calc.squareRoot(n));
			} else if (choice == 2) {
				System.out.print("Enter an integer to calculate its factorial: ");
				int n = scanner.nextInt();
				System.out.println(calc.factorial(n));
			} else if (choice == 3) {
				System.out.print("Enter a number to calculate its natural logarithm: ");
				double n = scanner.nextDouble();
				System.out.println(calc.naturalLog(n));
			} else if (choice == 4) {
				System.out.print("Enter two integers x and b to calculate x to the power b: ");
				double x = scanner.nextDouble();
				double b = scanner.nextDouble();
				System.out.println(calc.power(x, b));
			}
		}
	}
}
