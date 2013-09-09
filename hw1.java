import java.util.Scanner;


public class hw1 {
	public static void main(String[] args) {
		// three(1);
		five();
	}
	public static void three(double n) {
		System.out.println("Enter a vaule for x: ");
		Scanner s = new Scanner(System.in);

		double e = 2.71828182846;
		double x = s.nextDouble();

		double prevTerm = 1;
		double presum = 1;
		double term = (Math.pow(x,n - 1 ) / (prevTerm) * (x / n));

		// double sum = sum + term;

		

		System.out.println(term);
		System.out.println(x);
		System.out.println(n);
		System.out.println(prevTerm);
		// System.out.println(sum);

		
		
	}
	public static void five() {
		System.out.println("Enter a positive integer for N: ");
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int seqCount = 0; 
		 while (n != 1) {
		 	if ((n/2)*2 == n) {
		 		n = n/2;
		 		System.out.println(n);
		 		seqCount++;
		 	}else{
		 		n =(n * 3) + 1;
		 		System.out.println(n);
		 		seqCount++;
		 	}
		 	if(n == 1){
		 		System.out.println("Length of the sequence is:" +seqCount);
		 	}
		 	
		 }

	}
}