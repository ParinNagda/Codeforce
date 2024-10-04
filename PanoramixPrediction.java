import java.util.Scanner;

public class PanoramixPrediction {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		var val = isNextPrime(n);
		if (val == k) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;
	}

	public static int isNextPrime(int n) {
		int next = n + 1;
		while (!isPrime(next)) {
			next++;
		}
		return next;
	}

}



