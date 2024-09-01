import java.util.Scanner;

public class GameWithDoors {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int noOfCases = sc.nextInt();

		for (int i = 0; i < noOfCases; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int count = 0;
			if (a > d || c > b) {
				count = 1;
			} else if (d == a || b == c) {
				count = 2;
			} else if (a > c) {
				if (d < b) {
					count = d - a + 1 + 1;
				} else if (d == b) {
					count = b - a + 1;
				} else if (d > b) {
					count = b - a + 1 + 1;
				}
			} else if (a == c) {
				if (b == d) {
					count = b - a;
				} else if (d < b) {
					count = d - a + 1;
				} else if (d > b) {
					count = b - a + 1;
				}
			} else if (c > a) {
				if (d < b) {
					count = d - c + 2;
				} else if (d == b) {
					count = b - c + 1;
				} else if (d > b) {
					count = b - c + 2;
				}
			}
			System.out.println(count);
		}

		sc.close();
	}

}

