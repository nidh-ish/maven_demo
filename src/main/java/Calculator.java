import java.util.Scanner;
import java.lang.Math;

public class Calculator {
	public double squareRoot(int x) {
		return Math.sqrt(x);
	}

	public long factorial(int x) {
		long result = 1;
		for(int i = 1; i <= x; i++) {
			result = result * i;
		}
		return result;
	}

	public double naturalLog(double x) {
		return Math.log(x);
	}

	public double power(double x, double b) {
		return Math.pow(x, b);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator calc = new Calculator();

		System.out.print("Enter 1 for Squareroot function, 2 for Factorial function, 3 for NaturalLogarithm function, 4 for Power function, or 0 to exit: ");
		int choice = scanner.nextInt();

		if(choice == 0) {
			return;
		}
		else if(choice == 1) {
			System.out.print("Enter an integer to calculate its square root: ");
			int n = scanner.nextInt();
			System.out.println(calc.squareRoot(n));
		}
		else if(choice == 2) {
			System.out.print("Enter an integer to calculate its factorial: ");
			int n = scanner.nextInt();
			System.out.println(calc.factorial(n));
		}
		else if(choice == 3) {
			System.out.print("Enter a number to calculate its natural logarithm: ");
			double n = scanner.nextDouble();
			System.out.println(calc.naturalLog(n));
		}
		else if(choice == 4) {
			System.out.print("Enter two integers x and b to calculate x to the power b: ");
			double x = scanner.nextDouble();
			double b = scanner.nextDouble();
			System.out.println(calc.power(x, b));
		}
	}
}
