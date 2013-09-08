import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args) {
		double x = 0;
		Scanner reader = new Scanner(System.in);

		System.out.println("Enter x:");
		x = reader.nextDouble(); 
		eToTheX(x);
	}

	public static void eToTheX(double x) {
		double term = 1.0;
		double sum = 1.0;
		double iFactorial = 1.0;

		for (int i = 1; term >= .000000000001; i++) {
			iFactorial = factorial(i);
			term = xToTheN(x,i)/iFactorial;
			sum = sum + term;
			System.out.println("n: " + i + "\tterm: " + term + "\tsum: " + sum);
			iFactorial = 1;
		}

		System.out.println("\nmy\te^x: " + sum);
		System.out.println("real\te^x: " + Math.exp(x));

		return;
	}

	public static double xToTheN(double x, double n) {
		double sum = x;
		for (double i=1; i<n; i++) {
			sum = sum * x;
		}

		return sum;
	}

	public static double factorial(double n) {
		 double sum = 1;
		for (double i=n; i>0; i--) {
			sum = sum * i;	
		}

		return sum;
	}
}