import java.util.Scanner;


public class hw1 {
	public static void main(String[] args) {
		three(1.0);
		// five();
	}
	public static void three(double n) {
		System.out.println("Enter a vaule for x: ");
		Scanner s = new Scanner(System.in);

		double e = 2.71828182846;
		double x = s.nextDouble();

		double prevTerm = 1.0;
		double presum = 1.0;
		double term = (Math.pow(x,n - 1 ) / (prevTerm) * (x / n));

		double sum = presum + term;

		while (term < (Math.pow(1.0, -12))) {
			sum = sum + term;
			System.out.println(sum);
		}

		System.out.println(term);
		System.out.println(x);
		System.out.println(n);
		System.out.println(prevTerm);
		System.out.println(sum);
		System.out.println("Actual e to the xth power: " + Math.pow(e, x));

		 
		
	}
	public static void five() {
		System.out.println("Enter a positive integer for N: ");
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int seqCount = 0;
		int maxInt = n; 
		 while (n != 1) {
		 	if ((n/2)*2 == n) {
		 		n = n/2;
		 		System.out.println(n);
		 		if (n > maxInt) {
		 			maxInt = n;
		 		}
		 		seqCount++;
		 	}else{
		 		n =(n * 3) + 1;
		 		System.out.println(n);
		 		if (n > maxInt) {
		 			maxInt = n;
		 		}
		 		seqCount++;
		 	}
		 	if(n == 1){
		 		System.out.println("Length of the sequence is:" +seqCount);
		 		System.out.println("Max Integer is: " + maxInt);
		 	}
		 	
		 }

	}
}