import java.util.Scanner;

public class Supermarket {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int noOfSuperMarkets = scanner.nextInt();
		int kilosToBuy = scanner.nextInt();
		double minValue = Double.MAX_VALUE;

		for (int i = 1; i <= noOfSuperMarkets; i++) {
			int amount = scanner.nextInt();
			int kilosInamount = scanner.nextInt();

			double pricPerKile = (double) amount / kilosInamount;

			double cost = pricPerKile * kilosToBuy;

			if (cost < minValue) {
				minValue = cost;
			}

		}
		System.out.println(minValue);
	}

}
