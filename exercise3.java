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
		double iSubFactorial = 0.0;

		for (int i = 1; term >= Math.pow(10,-12); i++) {
			iSubFactorial = i;
			while (iSubFactorial > 1) {
				iFactorial = iFactorial * iSubFactorial;
				iSubFactorial = iSubFactorial - 1;
			}
			term = Math.pow(x,i)/iFactorial;
			sum = sum + term;
			System.out.println("n: " + i + "\tterm: " + term + "\tsum: " + sum);
			iFactorial = 1;
		}

		System.out.println("\nmy\te^x: " + sum);
		System.out.println("real\te^x: " + Math.exp(x));

		return;

	}
	
}