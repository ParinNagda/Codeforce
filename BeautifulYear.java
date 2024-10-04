import java.util.Scanner;

public class BeautifulYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		var year = sc.nextInt();
		var result = nextDistinct(year);
		System.out.println(result);
	}

	public static boolean isDistinct(int n) {
		if (n == 1000 || n == 9000) {
			return false;
		}

		var first = n / 1000;
		n = n % 1000;

		if (n <= 10) {
			return false;
		}
		var second = n / 100;
		n = n % 100;

		var third = n / 10;
		var fourth = n % 10;



		if (first == second || first == third || first == fourth || second == third || second == fourth
				|| third == fourth) {
			return false;
		}

		return true;
	}

	public static int nextDistinct(int n) {
		var num = n + 1;
		while (!isDistinct(num)) {
			num++;
		}
		return num;
	}


}
