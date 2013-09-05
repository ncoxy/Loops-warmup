public class september {
	public static void main(String[] args) {
		// zero(5);
		// one(2, 5);
		two(5);

	}
	public static void zero(int n) {
		int sum = 0;
		
		// int n = 5;

		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		

					
	}
	public static void one(int x, int n) {
		int exp = x;

		while (n > 1){
			exp = exp  * x;
			n--; 
			
	}
	System.out.println(exp);
}
	public static void two(int x) {
		int fact = 1;
		for ( x=x; x > 0 ; x-- ) {
			fact *= x;
		}
		System.out.println(fact);
	}
}