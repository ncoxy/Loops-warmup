import java.util.Scanner;


public class hw1 {
	public static void main(String[] args) {
		three(1);
	}
	public static void three(double n) {
		System.out.println("Enter a vaule for x: ");
		Scanner s = new Scanner(System.in);

		double x = s.nextDouble();

		double fact = 1;

		double term = (Math.pow(x,n - 1 ));

		// double sum = sum + term

		

		System.out.println(term);
		System.out.println(x);
		System.out.println(n);

		
		
	}
}