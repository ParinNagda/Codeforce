import java.util.Scanner;

public class SoldierBanana {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int firstBanana = scanner.nextInt();
		int initialMoney = scanner.nextInt();
		int noOfBananas = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i <= noOfBananas; i++) {
			sum += i * firstBanana;
		}
		int borrowedAmount = 0;
		if (sum > initialMoney) {
			borrowedAmount = sum - initialMoney;
		}
		System.out.println(borrowedAmount);
		scanner.close();
	}

}
