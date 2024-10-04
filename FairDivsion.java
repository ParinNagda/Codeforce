import java.util.Scanner;

public class FairDivsion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int ones = 0;
			int twos = 0;

			for (int j = 0; j < n; j++) {
				int candy = sc.nextInt();
				if (candy == 1) {
					ones++;
				} else {
					twos++;
				}
			}

			int totalWeight = ones + 2 * twos;
			if (totalWeight % 2 != 0) {
				System.out.println("NO");
			} else {
				int halfWeight = totalWeight / 2;
				if (halfWeight % 2 == 0 || (halfWeight % 2 == 1 && ones >= 1)) {
					if (halfWeight <= twos * 2 + ones) {
						System.out.println("YES");
					} else {
						System.out.println("NO");
					}
				} else {
					System.out.println("NO");
				}
			}
		}
		sc.close();
	}
}
