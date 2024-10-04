import java.util.Scanner;

public class BuyAShovel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int priceOfShovel = sc.nextInt();
		int rBurle = sc.nextInt();
		boolean checkChange = true;
		int i = 1;
		while (checkChange) {
			int price = priceOfShovel * i;
			if (price % 10 == 0) {
				System.out.println(i);
				checkChange = false;
			} else {
				int secondaryPrice = price - rBurle;
				if (secondaryPrice % 10 == 0) {
					System.out.println(i);
					checkChange = false;
				}
			}
			i++;
		}

	}


}
