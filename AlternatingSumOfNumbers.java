import java.util.Scanner;

public class AlternatingSumOfNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int noOfCases = sc.nextInt();

		for (int i = 0; i < noOfCases; i++) {

			int noOfNumbers = sc.nextInt();
			int value = 0;
			for (int j = 0; j < noOfNumbers; j++) {

				int val = sc.nextInt();
				if (j % 2 == 0) {
					value += val;
				} else {
					value -= val;
				}

			}
			System.out.println(value);
		}
		sc.close();
	}

}
