package extra;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int limit = 1000000000;
		
		System.out.println("Prime numbers between 0 and " + limit + ":");
		for (int num = 2; num <= limit; num++) {
			if (isPrime(num)) {
				System.out.println(num);
			}
		}
	}
	
	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false; // 0 and 1 are not prime
		}
		
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false; // if divisible by any number other than 1 and itself, it's not prime
			}
		}
		
		return true;
	}
}
