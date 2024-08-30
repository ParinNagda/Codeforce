import java.util.Scanner;

public class FairPlayoff {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int winner1, loser1, loser2;
		int winner2;
		for (int i = 1; i <= no; i++) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();

			if (a > b) {
				winner1 = a;
				loser1 = b;
			} else {
				winner1 = b;
				loser1 = a;
			}

			if (c > d) {
				winner2 = c;
				loser2 = d;
			} else {
				winner2 = d;
				loser2 = c;
			}

			if ((loser1 > winner2) || (loser2 > winner1)) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}

		}

	}

}
