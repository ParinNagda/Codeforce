import java.util.Scanner;

public class ThreeFriends {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOftestCase = sc.nextInt();

		for (int i = 1; i <= noOftestCase; i++) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int minDistance = Integer.MAX_VALUE;

			for (int x = -1; x <= 1; x++) {

				for (int y = -1; y <= 1; y++) {

					for (int z = -1; z <= 1; z++) {

						int aNew = a + x;
						int bNew = b + y;
						int cNew = c + z;

						int distance = Math.abs(aNew - bNew) + Math.abs(aNew - cNew) + Math.abs(bNew - cNew);
						minDistance = Math.min(minDistance, distance);

					}

				}

			}
			System.out.println(minDistance);
		}
		sc.close();

	}

	}
